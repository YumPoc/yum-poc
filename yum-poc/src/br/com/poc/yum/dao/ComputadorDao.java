package br.com.poc.yum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import br.com.poc.yum.ConnectionFactory;
import br.com.poc.yum.modelos.Computador;
import br.com.poc.yum.modelos.Hospital;

public class ComputadorDao {
	private Connection conexao;

	public ComputadorDao() throws ClassNotFoundException {
		this.conexao = new ConnectionFactory().getConnection();
	}
	public Computador gerarComputadorDinamicos(Computador computador) throws SQLException{
		
		String sql = "select top 1 * from computadores_dinamico where Cod_computador = (SELECT MAX(Cod_computador) FROM computadores_dinamico where Cod_computador = ?) order by id desc;";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, computador.getIdComputador());
		ResultSet rs = stmt.executeQuery();
		if (rs.wasNull()){
			return null;
		}
		computador.setUsoCpu(rs.getFloat("uso_cpu"));
		computador.setUsoDisco(rs.getFloat("uso_disco"));
		computador.setQuantidadeBateriaUsada(rs.getFloat("quant_bateria_usada"));
		computador.setUsoRam(rs.getFloat("uso_ram"));
		return computador;
	}
	
	public List<Computador> listaComputadoresGerais(Hospital hospital) throws SQLException{
		List<Computador> computadores = new ArrayList<Computador>();
		String sql = "select * from computadores_gerais where cod_cliente = ?;";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, hospital.getIdHospital());
		
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			computadores.add(adicionaComputador(rs));
		}
		return computadores;
	}

	private Computador adicionaComputador(ResultSet rs) throws SQLException {

		Computador pc = new Computador();
		
		pc.setIdComputador(rs.getInt("id_computador"));
		pc.setNumeroIp(rs.getString("numero_ip"));
		pc.setNome(rs.getString("nome_computador"));
		pc.setEnderecoMac(rs.getString("endereco_mac"));
		pc.setTipoProcessador(rs.getString("tipo_processador"));
		pc.setSistemaOperacional(rs.getString("tipo_sistema_operacional"));
		pc.setTamanhoHd(rs.getString("tamanho_hd"));

		return pc;

	}
}
