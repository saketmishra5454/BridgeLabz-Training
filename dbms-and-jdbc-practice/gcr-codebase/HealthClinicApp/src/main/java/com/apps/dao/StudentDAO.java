package com.apps.dao;

import com.apps.config.DBConnection;
import com.apps.model.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDao {

    public void insert(Student s) throws SQLException {
        String sql = "INSERT INTO students (name, email, age) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getName());   // 1st ? → name
            ps.setString(2, s.getEmail());  // 2nd ? → email
            ps.setInt   (3, s.getAge());    // 3rd ? → age

            int rows = ps.executeUpdate();
            System.out.println("  ✅ " + rows + " row inserted.");
        }
    }


    public List<Student> findAll() throws SQLException {
        String sql = "SELECT * FROM students ORDER BY id";
        List<Student> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new Student(
                        rs.getInt("id"),          // read column by name
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age")
                ));
            }
        }
        return list;
    }

    public Optional<Student> findById(int id) throws SQLException {
        String sql = "SELECT * FROM students WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(new Student(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getInt("age")
                    ));
                }
            }
        }
        return Optional.empty();
    }


    public void update(Student s) throws SQLException {
        String sql = "UPDATE students SET name = ?, email = ?, age = ? WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setInt   (3, s.getAge());
            ps.setInt   (4, s.getId());     // WHERE clause

            int rows = ps.executeUpdate();
            System.out.println("  ✏️ " + rows + " row updated.");
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            System.out.println("  🗑️ " + rows + " row deleted.");
        }
    }
}
