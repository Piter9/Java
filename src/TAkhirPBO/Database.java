package TAkhirPBO;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Fathir Maula. S/222011503/2KS4
 */
public class Database implements Serializable{
    public static Database instance;
    private final String DB_TYPE = "mysql";         //jenis database
    private final String DB_HOST = "localhost";    //host database
    private final String DB_PORT = "3306";        //port database
    private final String DB_NAME = "takhirpbo";  //nama database
    private final String DB_USER = "root";      //user database
    private final String DB_PASS = "";         //password database
    
    
    //Singleton - memastikan tidak ada duplikasi objek database
    private Database(){
    }

    public static synchronized Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }
    
    // ------------------------>Query untuk panel entry data
    public void insertMahasiswa(Mahasiswa mahasiswa) throws SQLException{
        Connection conn = getConnection();
        try{
            String sql="INSERT INTO mahasiswa VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mahasiswa.getNim());
            pstmt.setString(2, mahasiswa.getNama());
            pstmt.setString(3, mahasiswa.getJenisKelamin());
            pstmt.setInt(4, mahasiswa.getUmur());
            pstmt.setString(5, mahasiswa.getKelas());
            pstmt.setString(6, mahasiswa.getAlamat());
            pstmt.setString(7, mahasiswa.getProvinsi());
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public void deleteMahasiswa(String NIM) throws SQLException{
        Connection conn = getConnection();
        try{
            String sql="DELETE FROM mahasiswa WHERE NIM = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, NIM);
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public List<Mahasiswa> getListMahasiswa() throws SQLException{
        List<Mahasiswa> mhsList = new ArrayList<>();
        Connection conn = getConnection();
        try{
            String sql = "SELECT * FROM mahasiswa";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setJenisKelamin(rs.getString("jenis_kelamin"));
                mhs.setUmur(rs.getInt("umur"));
                mhs.setAlamat(rs.getString("alamat"));
                mhs.setProvinsi(rs.getString("provinsi"));
                mhs.setKelas(rs.getString("kelas"));
                mhsList.add(mhs);
            }
        }catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null){
                conn.close();
            }
        }
        return mhsList;
    }
    
    public void editMahasiswa(Mahasiswa mahasiswa, String nim) throws SQLException{
        Connection conn = getConnection();
        try{
            String sql="UPDATE mahasiswa SET nim=?,nama=?,jenis_kelamin=?,umur=?,alamat=?,provinsi=?,kelas=? WHERE nim = "+nim;
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mahasiswa.getNim());
            pstmt.setString(2, mahasiswa.getNama());
            pstmt.setString(3, mahasiswa.getJenisKelamin());
            pstmt.setInt(4, mahasiswa.getUmur());
            pstmt.setString(5, mahasiswa.getAlamat());
            pstmt.setString(6, mahasiswa.getProvinsi());
            pstmt.setString(7, mahasiswa.getKelas());
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    
    // ------------------------>Query untuk pembatasan akses di beberapa panel
    public void deleteCookies() throws SQLException{
        Connection conn = getConnection();
        try{
            String sql="DELETE FROM cookies ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    // ------------------------>Query untuk panel list dan cari
    public List<Mahasiswa> getFilterNimMahasiswa(String nim) throws SQLException{
        List<Mahasiswa> mhsList = new ArrayList<>();
        Connection conn = getConnection();
        try{
            String sql = "SELECT * FROM mahasiswa WHERE nim LIKE '%"+nim+"%'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setJenisKelamin(rs.getString("jenis_kelamin"));
                mhs.setUmur(rs.getInt("umur"));
                mhs.setAlamat(rs.getString("alamat"));
                mhs.setProvinsi(rs.getString("provinsi"));
                mhs.setKelas(rs.getString("kelas"));
                mhsList.add(mhs);
            }
        }catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null){
                conn.close();
            }
        }
        return mhsList;
    }
    
    public List<Mahasiswa> getFilterNamaMahasiswa(String nama) throws SQLException{
        List<Mahasiswa> mhsList = new ArrayList<>();
        Connection conn = getConnection();
        try{
            String sql = "SELECT * FROM mahasiswa WHERE nama LIKE '"+nama+"%'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setJenisKelamin(rs.getString("jenis_kelamin"));
                mhs.setUmur(rs.getInt("umur"));
                mhs.setAlamat(rs.getString("alamat"));
                mhs.setProvinsi(rs.getString("provinsi"));
                mhs.setKelas(rs.getString("kelas"));
                mhsList.add(mhs);
            }
        }catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null){
                conn.close();
            }
        }
        return mhsList;
    }
    
    public List<Mahasiswa> getFilterProvinsiMahasiswa(String provinsi) throws SQLException{
        List<Mahasiswa> mhsList = new ArrayList<>();
        Connection conn = getConnection();
        try{
            String sql = "SELECT * FROM mahasiswa WHERE provinsi LIKE '%"+provinsi+"%'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setJenisKelamin(rs.getString("jenis_kelamin"));
                mhs.setUmur(rs.getInt("umur"));
                mhs.setAlamat(rs.getString("alamat"));
                mhs.setProvinsi(rs.getString("provinsi"));
                mhs.setKelas(rs.getString("kelas"));
                mhsList.add(mhs);
            }
        }catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null){
                conn.close();
            }
        }
        return mhsList;
    }
    
    public List<Mahasiswa> getFilterJKMahasiswa(String jk) throws SQLException{
        List<Mahasiswa> mhsList = new ArrayList<>();
        Connection conn = getConnection();
        try{
            String sql = "SELECT * FROM mahasiswa WHERE jenis_kelamin LIKE '%"+jk+"%'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setJenisKelamin(rs.getString("jenis_kelamin"));
                mhs.setUmur(rs.getInt("umur"));
                mhs.setAlamat(rs.getString("alamat"));
                mhs.setProvinsi(rs.getString("provinsi"));
                mhs.setKelas(rs.getString("kelas"));
                mhsList.add(mhs);
            }
        }catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null){
                conn.close();
            }
        }
        return mhsList;
    }
    
    //mendapatkan koneksi ke database yang ada
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:"+DB_TYPE+"://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME,DB_USER,DB_PASS);
    }
}