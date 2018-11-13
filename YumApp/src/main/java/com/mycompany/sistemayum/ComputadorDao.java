package com.mycompany.sistemayum;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComputadorDao {

    private final Connection conexao;

    public ComputadorDao() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().getConnection();

    }

    public void adiciona(Computador computador) {
        String insertComputadores = "INSERT INTO Computadores (Numero_IP, Nome_Computador, Endereco_Mac, "
                + "Setor_Hospital, Proprietario_Computador, Tipo_Processador, Tipo_Sistema_Operacional,"
                + " Tamanho_HD, Tamanho_Ram, Cod_Cliente)"
                + "VALUES (?,?,?,'padrao','padrao',?,?,?,?,3)";
        try {
            PreparedStatement insertComputador = conexao.prepareStatement(insertComputadores);
            //seta ps valores
            insertComputador.setString(1, computador.getNumeroIp());
            insertComputador.setString(2, computador.getNome());
            insertComputador.setString(3, computador.getEnderecoMac());
            insertComputador.setString(4, computador.getTipoProcessador());
            insertComputador.setString(5, computador.getSistemaOperacional());
            insertComputador.setString(6, computador.getTamanhoHd());
            insertComputador.setString(7, computador.getTamanhoRam());

            insertComputador.execute();

            insertComputador.close();
            System.out.println("Deu bom");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
