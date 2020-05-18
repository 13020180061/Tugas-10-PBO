/*
    Nama    : St.Hatijah H.Ilyas
    Stambuk : 13020180061
    Tanggal : 16 Mei 2020
    Waktu   : 21.45 WITA 
*/

import java.sql.SQLException;
import java.util.List;

public interface InterfaceMahasiswa {
    Mahasiswa insert(Mahasiswa o) throws SQLException;
    void update(Mahasiswa o) throws SQLException;
    void delete(String nim) throws SQLException;
    List getAll() throws SQLException;
}
