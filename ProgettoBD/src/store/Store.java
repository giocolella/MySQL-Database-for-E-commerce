package store;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Store {
	
	public Store() {
		
	}
	
	public void insertClient() throws ParseException {
		Connection con = null;
		PreparedStatement ps = null;
		int rs = 0;
		Scanner sn = new Scanner(System.in);
		
		try {
			con = DBConnectionPool.getConnection();
			
			String sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			
			String param = sn.nextLine();
			ps.setString(1, param);
			
			param = sn.nextLine();
			ps.setString(2, param);
			
			param = sn.nextLine();
			ps.setString(3, param);
			
			String date1 = sn.nextLine();
			DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			java.util.Date date = formatter.parse(date1);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			
			ps.setDate(4, sqlDate);
			param = sn.nextLine();
			
			ps.setString(5, param);
			param = sn.nextLine();
			
			ps.setString(6, param);
			param = sn.nextLine();
			
			ps.setString(7, param);
			param = sn.nextLine();
			
			ps.setString(8, param);
			date1 = sn.nextLine();
			formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse(date1);
			java.sql.Date sqlDate2 = new java.sql.Date(date.getTime());
			
			ps.setDate(9, sqlDate2);
			int param3 = sn.nextInt();
			ps.setInt(10, param3);
			
			rs = ps.executeUpdate();
			con.commit();
			if(rs == 0)
				System.out.println("not working");
			
			ResultSet rs1 = null;
			Statement st = con.createStatement();
			sql = "SELECT * FROM Cliente";
			rs1 = st.executeQuery(sql);
			
			while(rs1.next()) {
				Cliente c = new Cliente();
				c.setCf(rs1.getString("cf"));
				c.setCognome(rs1.getString("cognome"));
				c.setData(rs1.getDate("dataNascita"));
				c.setNome(rs1.getString("nome"));
				c.setEmail(rs1.getString("email"));
				c.setIndirizzo(rs1.getString("indirizzo"));
				c.setPassword(rs1.getString("passw"));
				c.setCardExpire(rs1.getString("scadenzaCarta"));
				c.setCreditCard(rs1.getString("cartadiCredito"));
				c.setNumTotAcquisti(rs1.getInt("numTotaleAcquisti"));
				c.print();

			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(ps != null) 
						ps.close();
					DBConnectionPool.releaseConnection(con);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}
	
	public void insertOrder() throws ParseException {
		Connection con = null;
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		PreparedStatement ps3 = null;
		int rs = 0;
		Scanner sn = new Scanner(System.in);
		
		try {
			con = DBConnectionPool.getConnection();
			
			String sql = "INSERT INTO Pagamento VALUES(0,?,?,?);";
			ps = con.prepareStatement(sql);
			
			//int i4 = sn.nextInt();
			//ps.setInt(1,i4);
			
			String date1 = sn.next();
			DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			java.util.Date date = formatter.parse(date1);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			
			ps.setDate(1, sqlDate);
			
			String param = sn.next();
			ps.setString(2, param);
			
			//double i = sn.nextDouble();
			String i2 = sn.next();
			Double i = Double.parseDouble(i2);
			ps.setDouble(3,i);
			
			rs = ps.executeUpdate();
			con.commit();
			
			if(rs == 0)
				System.out.println("not working");
		
			sql = "INSERT INTO Spedizione VALUES(0,?,?,?);";
			ps2 = con.prepareStatement(sql);
			
			//int i3 = sn.nextInt();
			//ps2.setInt(1, i3);
			
			date1 = sn.next();
			date = formatter.parse(date1);
			sqlDate = new java.sql.Date(date.getTime());
			
			ps2.setDate(1, sqlDate);
			
			date1 = sn.next();
			date = formatter.parse(date1);
			sqlDate = new java.sql.Date(date.getTime());
			
			ps2.setDate(2, sqlDate);
			
			i2 = sn.next();
			i = Double.parseDouble(i2);
			ps2.setDouble(3,i);
			
			rs = ps2.executeUpdate();
			con.commit();
			if(rs == 0)
				System.out.println("not working");
			
			sql = "INSERT INTO Ordine VALUES(0,?,?,?,?);";
			ps3 = con.prepareStatement(sql);
			
			//i3 = sn.nextInt();
			//ps3.setInt(1, i3);
			
			param = sn.next();
			ps3.setString(1,param);
			
			int i1 = sn.nextInt();
			ps3.setInt(2, i1);
			
			date1 = sn.next();
			date = formatter.parse(date1);
			sqlDate = new java.sql.Date(date.getTime());
			
			ps3.setDate(3, sqlDate);
			
			i1 = sn.nextInt();
			ps3.setInt(4,i1);
			
			rs = ps3.executeUpdate();
			con.commit();
			if(rs == 0)
				System.out.println("not working");
			
			sql = "INSERT INTO Di VALUES(?,?,?);";
			ps1 = con.prepareStatement(sql);
			
			i1 = sn.nextInt();
			ps1.setInt(1, i1);
			
			i1 = sn.nextInt();
			ps1.setInt(2, i1);
			
			param = sn.next();
			ps1.setString(3, param);
			
			rs = ps1.executeUpdate();
			con.commit();
			if(rs == 0)
				System.out.println("not working");
			
			}catch(SQLException e) {
					e.printStackTrace();
			} finally {
				try {
					if(ps != null) 
						ps.close();
					if(ps1 != null) 
						ps1.close();
					if(ps2 != null) 
						ps2.close();
					if(ps3 != null) 
						ps3.close();
					DBConnectionPool.releaseConnection(con);
				
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}
	
	public void removeReview() {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sn = new Scanner(System.in);
		
		try {
			con = DBConnectionPool.getConnection();
			
			String sql = "DELETE FROM Recensione WHERE numero = ? AND idProdotto = ?;";
			ps = con.prepareStatement(sql);
			
			int i = sn.nextInt();
			ps.setInt(1, i);
			
			i = sn.nextInt();
			ps.setInt(2, i);
			
			int result = ps.executeUpdate();
			
			if(result > 0) {
				System.out.println("Eliminate " + result + " tuple");
				con.commit();
			}else {
				System.out.println("Nessuna cancellazione");
			}
	} catch(SQLException e) {
		e.printStackTrace();
	} finally {
			try {
				if(ps != null) 
					ps.close();
				DBConnectionPool.releaseConnection(con);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
	
	public void removeOrder() {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sn = new Scanner(System.in);
		Statement st = null;
		
		try {
			con = DBConnectionPool.getConnection();
			st = con.createStatement();
			st.execute("SET FOREIGN_KEY_CHECKS=0");
			String sql = "DELETE FROM Ordine WHERE id = ?;";
			ps = con.prepareStatement(sql);
			
			int i = sn.nextInt();
			ps.setInt(1, i);
			
			int result = ps.executeUpdate();
			
			if(result > 0) {
				System.out.println("Eliminate " + result + " tuple");
				con.commit();
			}else {
				System.out.println("Nessuna cancellazione");
			}
			
			sql = "DELETE FROM Spedizione WHERE codice = ?;";
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, i);
			
			result = ps.executeUpdate();
			
			if(result > 0) {
				System.out.println("Eliminate " + result + " tuple");
				con.commit();
			}else {
				System.out.println("Nessuna cancellazione");
			}
			
			sql = "DELETE FROM Pagamento WHERE id = ?;";
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, i);
			
			result = ps.executeUpdate();
			
			if(result > 0) {
				System.out.println("Eliminate " + result + " tuple");
				con.commit();
			}else {
				System.out.println("Nessuna cancellazione");
			}
			
			st.execute("SET FOREIGN_KEY_CHECKS=1");
			sql = "DELETE FROM Di WHERE idOrdine = ?;";
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, i);
			
			result = ps.executeUpdate();
			if(result > 0) {
				System.out.println("Eliminate " + result + " tuple");
				con.commit();
			}else {
				System.out.println("Nessuna cancellazione");
			}
	} catch(SQLException e) {
		e.printStackTrace();
	} finally {
			try {
				if(ps != null) 
					ps.close();
				DBConnectionPool.releaseConnection(con);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	}
	
	public void totAcquisti() {
		Connection con = null;
		Statement st = null;
		ResultSet rs1 = null;
		
		try {
			con = DBConnectionPool.getConnection();
			
			String sql = "SELECT nome,cognome,indirizzo,cf,numTotaleAcquisti FROM Cliente;";
			st = con.createStatement();
			rs1 = st.executeQuery(sql);
			
			while(rs1.next()) {
				Cliente c = new Cliente();
				c.setCf(rs1.getString("cf"));
				c.setCognome(rs1.getString("cognome"));
				c.setNome(rs1.getString("nome"));
				c.setIndirizzo(rs1.getString("indirizzo"));
				c.setNumTotAcquisti(rs1.getInt("numTotaleAcquisti"));
				c.print();

			}	
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(rs1 != null) 
						rs1.close();
					if(st != null)
						st.close();
					DBConnectionPool.releaseConnection(con);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}

	public void pickupSelector() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sn = new Scanner(System.in);
		
		try {
			con = DBConnectionPool.getConnection();
			
			String sql = "select * from ChitarraElettrica as ce,Prodotto as p where ce.idProdotto = p.codice and ce.tipoPickup = ?;";
			ps = con.prepareStatement(sql);
			
			String param = sn.nextLine();
			ps.setString(1, param);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Prodotto p = new Prodotto();
				p.setCodice(rs.getInt("codice"));
				p.setMarca(rs.getString("marca"));
				p.setColore(rs.getString("colore"));
				p.setPrezzo(rs.getDouble("prezzo"));
				p.setQuantita(rs.getInt("quantitaDisponibile"));
				p.print();
				///*
				System.out.println("Specifiche Tabella ChitarraElettrica: ");
				ChitarraElettrica ce = new ChitarraElettrica();
				ce.setNumeroCorde(rs.getInt("numeroCorde"));
				ce.setIdProdotto(rs.getInt("idProdotto"));
				ce.print();
				//*/
			}
		} catch(SQLException e) {
			System.err.println(e.getStackTrace());
		} finally {
				try {
					if(rs!= null)
						rs.close();
					if(ps != null) 
						ps.close();
					DBConnectionPool.releaseConnection(con);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}
	
	public void priceSelector(int i) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sn = new Scanner(System.in);
		String sql = null;
		try {
			con = DBConnectionPool.getConnection();
			
			if(i == 1) {
				sql = "SELECT * FROM Prodotto WHERE prezzo < ?";
			}
			if(i==2) {
				sql = "SELECT * FROM Prodotto WHERE prezzo = ?";
			}
			if(i==3) {
				sql = "SELECT * FROM Prodotto WHERE prezzo > ?";
			}
			ps = con.prepareStatement(sql);
			String i2 = sn.next();
			Double d = Double.parseDouble(i2);
			ps.setDouble(1,d);
			rs = ps.executeQuery();
			while(rs.next()) {
				Prodotto p = new Prodotto();
				p.setCodice(rs.getInt("codice"));
				p.setMarca(rs.getString("marca"));
				p.setColore(rs.getString("colore"));
				p.setPrezzo(rs.getDouble("prezzo"));
				p.setQuantita(rs.getInt("quantitaDisponibile"));
				p.print();
			}
		} catch(SQLException e) {
			System.err.println(e.getStackTrace());
		} finally {
				try {
					if(rs!= null)
						rs.close();
					if(ps != null) 
						ps.close();
					DBConnectionPool.releaseConnection(con);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	public void orderComplex1() throws ParseException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sn = new Scanner(System.in);
		
		try {
			con = DBConnectionPool.getConnection();
			
			String sql = "select o.id from Ordine as o, Di as d, Prodotto as p, Pagamento as pa where d.idOrdine = o.id and d.idProdotto = p.codice and o.idPagamento = pa.id and o.dataOrdine = ? and pa.importo > ? and p.colore = ?;";
			ps = con.prepareStatement(sql);
			
			String date1 = sn.next();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	        java.util.Date parsed = format.parse(date1);
	        java.sql.Date sqlDate = new java.sql.Date(parsed.getTime());
			ps.setDate(1, sqlDate);
			
			String i2 = sn.next();
			double i = Double.parseDouble(i2);
			ps.setDouble(2,i);
			
			String i3 = sn.next();
			ps.setString(3, i3);
			
			rs = ps.executeQuery();

			while(rs.next()) {
				Ordine o = new Ordine();
				o.setId(rs.getInt("id"));
				o.print();
			}
		} catch(SQLException e) {
			System.err.println(e.getStackTrace());
		} finally {
				try {
					if(rs!= null)
						rs.close();
					if(ps != null) 
						ps.close();
					DBConnectionPool.releaseConnection(con);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	public void orderComplex2() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sn = new Scanner(System.in);
		
		try {
			con = DBConnectionPool.getConnection();
			
			String sql = "select p.codice, p.marca, r.voto from Prodotto as p, Recensione as r where r.idProdotto = p.codice and p.quantitaDisponibile > ? and p.colore = ? group by p.codice having ? < (select avg(r.voto) from Recensione as r where r.idProdotto = p.codice);";
			ps = con.prepareStatement(sql);
			
			
			int i = sn.nextInt();
			ps.setInt(1, i);
			
			String param = sn.next();
			ps.setString(2, param);
			
			i = sn.nextInt();
			ps.setInt(3, i);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%-2d | %-15s | %-2s \n",rs.getInt("codice"),rs.getString("marca"),rs.getString("voto"));
			}
		} catch(SQLException e) {
			System.err.println(e.getStackTrace());
		} finally {
				try {
					if(rs!= null)
						rs.close();
					if(ps != null) 
						ps.close();
					DBConnectionPool.releaseConnection(con);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	public void orderComplex3() throws ParseException {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sn = new Scanner(System.in);
		
		try {
			con = DBConnectionPool.getConnection();
			
			String sql = "select o.id from Prodotto as p, Di as d, Spedizione as s, Ordine as o where d.idOrdine = o.id and d.idProdotto = p.codice and o.idSpedizione = s.codice and s.dataArrivo = ? and not exists (select * from Recensione as r where r.idProdotto = p.codice);";
			
			ps = con.prepareStatement(sql);
			
			String date1 = sn.next();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	        java.util.Date parsed = format.parse(date1);
	        java.sql.Date sqlDate = new java.sql.Date(parsed.getTime());
			ps.setDate(1, sqlDate);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Ordine o = new Ordine();
				o.setId(rs.getInt("id"));
				o.print();
			}
		} catch(SQLException e) {
			System.err.println(e.getStackTrace());
		} finally {
				try {
					if(rs!= null)
						rs.close();
					if(ps != null) 
						ps.close();
					DBConnectionPool.releaseConnection(con);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	public static void main(String[] args) throws SQLException, ParseException {
		Store db = new Store();

		int index = 0;
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Selezionare Operazione da 1 a 10 da eseguire: \n");
		index = sn.nextInt();
		
		switch(index) {
			case 1:
				db.insertClient();
				break;
			case 2:
				db.insertOrder();
				break;
			case 3:
				db.removeReview();
				break;
			case 4:
				db.totAcquisti();
				break;
			case 5:
				db.pickupSelector();
				break;
			case 6:
				db.priceSelector(1);
				break;
			case 7:
				db.orderComplex1();
				break;
			case 8:
				db.orderComplex2();
				break;
			case 9:
				db.orderComplex3();
				break;
			case 10:
				db.removeOrder();
				break;
			default:
				break;		
		}
		
	}

}
