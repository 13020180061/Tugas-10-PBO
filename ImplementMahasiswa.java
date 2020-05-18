/*
    Nama    : St.Hatijah H.Ilyas
    Stambuk : 13020180061
    Tanggal : 16 Mei 2020
    Waktu   : 23.01 WITA 
*/

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ImplementMahasiswa implements InterfaceMahasiswa{
    public Mahasiswa insert(Mahasiswa o) throws SQLException{
        PreparedStatement
                st=DatabaseUtilities.getConnection().prepareStatement
                ("insert into mahasiswa vaues(?,?,?)");
                    st.setString(1, o.getNim());
                    st.setString(2, o.getNama());
                    st.setString(3, o.getAlamat());
                    st.executeUpdate();
                    return o;
    }
    
    public void update(Mahasiswa o) throws SQLException{
        PreparedStatement
                st=DatabaseUtilities.getConnection().prepareStatement
                ("update mahasiswa set nama=?, alamat=?, nim=?");
                    st.setString(1, o.getNama());
                    st.setString(2, o.getNama());
                    st.setString(3, o.getAlamat());
                    st.executeUpdate();
    }
    
    public void delete(String nim) throws SQLException{
        PreparedStatement
                st=DatabaseUtilities.getConnection().prepareStatement
                ("delete from mahasiswa where nim=?");
                    st.setString(1, nim);
                    st.executeUpdate();
    }
    
    public List getAll() throws SQLException{
        Statement
           st=DatabaseUtilities.getConnection().createStatement();
           ResultSet rs = st.executeQuery("select*from mahasiswa");
           List list = new ArrayList();
           while(rs.next()){
               Mahasiswa mhs = new Mahasiswa();
               mhs.setNim(rs.getString("nim"));
               mhs.setNama(rs.getString("nama"));
               mhs.setAlamat(rs.getString("alamat"));
               list.add(mhs);
           }
           return list;
    }
}
