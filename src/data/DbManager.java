/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbManager {
    private Connection connection; // Conexão ativa no banco.

    public static void main(String[] args) throws SQLException {
        DbManager dbManager = new DbManager();

        //dbManager.insertTasks("Tarefa teste");
        dbManager.selectTasks(false);
        dbManager.selectTasks(true);
        dbManager.close();
    }

    public DbManager() throws SQLException {
        String url  = "jdbc:postgresql://db.hpwsyhmalwkmeuqdqcpm.supabase.co:5432/postgres";
        String user = "postgres";
        String pass = "FasoftTryTasks";

        connection = DriverManager.getConnection(url, user, pass);
        System.out.println("Conectado ao Supabase!");
    }

    public List<String> selectTasks(boolean is_completed) {
        String sql = "SELECT * FROM tasks WHERE is_completed = ?";
        List<String> tasks = new ArrayList<>();

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setBoolean(1, is_completed); // define [is_completed = false] na consulta.
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    tasks.add(rs.getString(2));
                    printTasks(rs);
                }
            } catch (SQLException e) {
            System.err.println("Não foi possível executar o select:");
            e.printStackTrace();
            }
        } catch (SQLException e) {
            System.err.println("Não foi possível realizar o prepareStatement:");
            e.printStackTrace();
        }

        return tasks;
    }

    public void insertTasks(String description) {
        String sql = "INSERT INTO tasks(description, is_completed) VALUES(?, ?)";

        try(PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, description);
            ps.setBoolean(2, false);
            int linhas = ps.executeUpdate();   // agora grava
            System.out.println("Inseriu " + linhas + " linha(s)");
        } catch(SQLException e) {
            System.err.println("Não foi possível inserir a tarefa:");
            e.printStackTrace();
        }
    }

    public void updateStats(int id, boolean newStats) {
        String sql = "UPDATE tasks SET is_completed = ? WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setBoolean(1, newStats);
            ps.setInt(2, id);
            int linhas = ps.executeUpdate();   // linhas alteradas
            System.out.println("Alterou " + linhas + " linha(s)");
        } catch (SQLException e) {
            System.err.println("Não foi possível inserir a tarefa:");
            e.printStackTrace();
        }
    }

    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) connection.close();
    }

    public static void printTasks(ResultSet rs) throws SQLException {
        System.out.printf("id: %d | description: %s | is_completed: %b%n",
                rs.getInt(1), rs.getString(2), rs.getBoolean(3));
    }
}
