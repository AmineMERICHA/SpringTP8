package dz.ibnrochd.Master14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Master14Tp8Application implements CommandLineRunner{
	private static final Logger log = LoggerFactory.getLogger(Master14Tp8Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Master14Tp8Application.class, args);
	}
		
	@Autowired
		JdbcTemplate JdbcTemplate;
	@Override
	public void run(String... String) throws Exception {
		
		  String sql = "SELECT * FROM Wilaya";
	        List<Wilaya> Wil = JdbcTemplate.query(sql,(rs, rowNum)-> 
	        new Wilaya(rs.getInt(1),
					rs.getBoolean(2), rs.getInt(3), rs.getInt(4), rs.getDate(5),rs.getDate(6), rs.getString(7), 
					rs.getString(8), rs.getString(9)));         
	        Wil.forEach (Wilaya -> System.out.println(Wilaya));
	        	
	   }
		public static Logger getLog() {
			return log;
		}
		
}
