package br.com.poc.yum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.poc.yum.ConnectionFactory;
import br.com.poc.yum.modelos.Computador;
import br.com.poc.yum.modelos.ComputadorDinamico;
import br.com.poc.yum.modelos.Hospital;

public class ComputadorDao {
	private Connection conexao;

	public ComputadorDao() throws ClassNotFoundException {
		this.conexao = new ConnectionFactory().getConnection();
	}

	public ComputadorDinamico gerarComputadorDinamicos(Computador computador) throws SQLException {
		ComputadorDinamico dinamico = new ComputadorDinamico();
		String sql = "select top 1 uso_cpu,uso_disco,quant_bateria_usada,uso_ram"
				+ " from computadores_dinamico where Cod_computador = "
				+ "(SELECT MAX(Cod_computador) FROM computadores_dinamico where Cod_computador = ?) order by id desc;";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, computador.getIdComputador());

		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			dinamico.setUsoCpu(rs.getFloat("uso_cpu"));
			dinamico.setUsoDisco(rs.getFloat("uso_disco"));
			dinamico.setQuantidadeBateriaUsada(rs.getFloat("quant_bateria_usada"));
			dinamico.setUsoRam(rs.getFloat("uso_ram"));
		}
		rs.close();
		stmt.close();
		return dinamico;
	}

	public List<Computador> listaComputadoresGerais(Hospital hospital) throws SQLException {
		List<Computador> computadores = new ArrayList<Computador>();
		String sql = "select * from computadores_gerais where cod_cliente = ?;";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, hospital.getIdHospital());

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			computadores.add(adicionaComputador(rs));
		}
		rs.close();
		stmt.close();
		return computadores;
	}

	public Computador selecionaComputador(Computador computador) throws SQLException {
		String sql = "select * from computadores_gerais where id_computador = ?;";
		String sql2 = "select MAX(quant_bateria_usada)as quant_bateria_usada, max(uso_cpu)as uso_cpu,"
				+ "max(uso_disco)as uso_disco,max(download)as download,max(upload)as upload,"
				+ "max(uso_ram)as uso_ram from computadores_dinamico where cod_computador = ?;";
		String sql3 = "select MIN(quant_bateria_usada)as quant_bateria_usada, min(uso_cpu)as uso_cpu,"
				+ "min(uso_disco)as uso_disco,min(download)as download,min(upload)as upload,"
				+ "min(uso_ram)as uso_ram from computadores_dinamico where cod_computador = ?;";
		String sql4 = "select avg(quant_bateria_usada)as quant_bateria_usada, avg(uso_cpu)as uso_cpu,"
				+ "avg(uso_disco)as uso_disco,avg(download)as download,avg(upload)as upload,"
				+ "avg(uso_ram)as uso_ram from computadores_dinamico where cod_computador = ?;";

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, computador.getIdComputador());

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			computador.setIdComputador(rs.getInt("id_computador"));
			computador.setNumeroIp(rs.getString("numero_ip"));
			computador.setNome(rs.getString("nome_computador"));
			computador.setEnderecoMac(rs.getString("endereco_mac"));
			computador.setTipoProcessador(rs.getString("tipo_processador"));
			computador.setSistemaOperacional(rs.getString("tipo_sistema_operacional"));
			computador.setTamanhoHd(rs.getString("tamanho_hd"));
		}
		rs.close();
		stmt.close();

		// Máxima
		PreparedStatement stmt2 = conexao.prepareStatement(sql2);
		stmt2.setInt(1, computador.getIdComputador());
		ResultSet rs2 = stmt2.executeQuery();

		while (rs2.next()) {
			computador.setDownloadMaxima(rs2.getFloat("download"));
			computador.setQuantidadeBateriaUsadaMaxima(rs2.getFloat("quant_bateria_usada"));
			computador.setUsoCpuMaxima(rs2.getFloat("uso_cpu"));
			computador.setUsoDiscoMaxima(rs2.getFloat("uso_disco"));
			computador.setUsoRamMaxima(rs2.getFloat("uso_ram"));
			computador.setUploadMaxima(rs2.getFloat("upload"));

		}

		rs2.close();
		stmt2.close();

		// Minima
		PreparedStatement stmt3 = conexao.prepareStatement(sql3);
		stmt3.setInt(1, computador.getIdComputador());
		ResultSet rs3 = stmt3.executeQuery();

		while (rs3.next()) {
			computador.setDownloadMinima(rs3.getFloat("download"));
			computador.setQuantidadeBateriaUsadaMinima(rs3.getFloat("quant_bateria_usada"));
			computador.setUsoCpuMinima(rs3.getFloat("uso_cpu"));
			computador.setUsoDiscoMinima(rs3.getFloat("uso_disco"));
			computador.setUsoRamMinima(rs3.getFloat("uso_ram"));
			computador.setUploadMinima(rs3.getFloat("upload"));

		}

		rs3.close();
		stmt3.close();

		// Média
		PreparedStatement stmt4 = conexao.prepareStatement(sql4);
		stmt4.setInt(1, computador.getIdComputador());
		ResultSet rs4 = stmt4.executeQuery();

		while (rs4.next()) {
			computador.setDownloadMedia(rs4.getFloat("download"));
			computador.setQuantidadeBateriaUsadaMedia(rs4.getFloat("quant_bateria_usada"));
			computador.setUsoCpuMedia(rs4.getFloat("uso_cpu"));
			computador.setUsoDiscoMedia(rs4.getFloat("uso_disco"));
			computador.setUsoRamMedia(rs4.getFloat("uso_ram"));
			computador.setUploadMedia(rs4.getFloat("upload"));

		}

		rs4.close();
		stmt4.close();

		return computador;
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
