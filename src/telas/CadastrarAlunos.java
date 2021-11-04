/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import  java.util.Date;  
import Utilitarios.ModeloTabela;
import Utilitarios.conectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastrarAlunos extends javax.swing.JFrame {

    conectaBanco conecta= new conectaBanco();
    double total=0,AlunosDaTurma=0,MaxAlunos=0;
    ArrayList dados=new ArrayList();
    String[] Colunas=new String[]{"Nºinscrição","Modalidade","Dia","Horário","Professor","Aluno","RG Do Aluno","Janeiro","Fevereiro","Março",
                                  "Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
    
    
    public CadastrarAlunos() {
        initComponents();
        preencherJComboBoxModalidade();
        preencherJComboBoxDia();
        preencherJComboBoxHorario();
        preencherJComboBoxProfessor();
        conecta.conexao();
        preencherTabelaAlunosModalidadeGeral();
        fazerSomaModalidadeGeral();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableA = new javax.swing.JTable();
        jTextFieldNomeAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldRgAluno = new javax.swing.JTextField();
        jTextFieldNomeResponsavel = new javax.swing.JTextField();
        jTextFieldRgDoResponsavel = new javax.swing.JTextField();
        jTextFieldIdade = new javax.swing.JTextField();
        jTextFieldNumeroDeInscricao = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldCelularObrigatorio2 = new javax.swing.JTextField();
        jTextFieldTelefoneFixo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldRua = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jComboBoxModalidadeCadastro = new javax.swing.JComboBox<>();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCelularObrigatorio1 = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jComboBoxHorario = new javax.swing.JComboBox<>();
        jComboBoxProfessor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jDateChooserDataNasc = new com.toedter.calendar.JDateChooser();
        jDateChooserDataInicio = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldVagas = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();

        jTableA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableA);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextFieldNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeAlunoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome do aluno:");

        jLabel3.setText("Nome do responsável :");

        jLabel4.setText("RG do aluno:");

        jLabel5.setText("RG responsável:");

        jLabel7.setText("Data nasc:");

        jLabel8.setText("Idade:");

        jLabel9.setText("Rua:");

        jLabel10.setText("Número:");

        jLabel11.setText("Bairro:");

        jLabel14.setText("Celular 1:");

        jLabel15.setText("Modalidade:");

        jLabel16.setText("Estado:");

        jTextFieldRgAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRgAlunoActionPerformed(evt);
            }
        });

        jTextFieldNomeResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeResponsavelActionPerformed(evt);
            }
        });

        jTextFieldRgDoResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRgDoResponsavelActionPerformed(evt);
            }
        });

        jTextFieldIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdadeActionPerformed(evt);
            }
        });

        jTextFieldNumeroDeInscricao.setEditable(false);
        jTextFieldNumeroDeInscricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroDeInscricaoActionPerformed(evt);
            }
        });

        jTextFieldCelularObrigatorio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCelularObrigatorio2ActionPerformed(evt);
            }
        });

        jTextFieldTelefoneFixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneFixoActionPerformed(evt);
            }
        });

        jLabel18.setText("Tel. fixo:(opc)");

        jLabel20.setText("Data Inicio:");

        jTextFieldEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoActionPerformed(evt);
            }
        });

        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });

        jTextFieldBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroActionPerformed(evt);
            }
        });

        jTextFieldRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRuaActionPerformed(evt);
            }
        });

        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });

        jComboBoxModalidadeCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxModalidadeCadastro.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxModalidadeCadastroPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxModalidadeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModalidadeCadastroActionPerformed(evt);
            }
        });

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jLabel6.setText("Nº de inscrição:");

        jTextFieldCelularObrigatorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCelularObrigatorio1ActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jLabel13.setText("Existem");

        jLabel17.setText("alunos nestas condições de pesquisa.");

        jLabel19.setText("Celular 2:");

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(jTableAlunos);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("CADASTRO DE ALUNOS");

        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos os dias" }));
        jComboBoxDia.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxDiaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos os horários" }));
        jComboBoxHorario.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxHorarioPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBoxProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos os professores" }));
        jComboBoxProfessor.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxProfessorPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel1.setText("Cidade:");

        jLabel21.setText("Dia:");

        jLabel22.setText("Horário:");

        jLabel24.setText("Professor:");

        jLabel25.setText("Existem");

        jTextFieldVagas.setEditable(false);
        jTextFieldVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVagasActionPerformed(evt);
            }
        });

        jLabel26.setText("vagas para essa turma.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldNumeroDeInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldRgAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRgDoResponsavel)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 20, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCelularObrigatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jTextFieldCelularObrigatorio2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(jTextFieldTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldEstado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNumero)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxModalidadeCadastro, javax.swing.GroupLayout.Alignment.LEADING, 0, 345, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxDia, 0, 345, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxHorario, 0, 345, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxProfessor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonCadastrar)
                                        .addGap(6, 6, 6)
                                        .addComponent(jButtonEditar)
                                        .addGap(6, 6, 6)
                                        .addComponent(jButtonExcluir)
                                        .addGap(6, 6, 6)
                                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNumeroDeInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldRgAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldRgDoResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooserDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(jLabel16)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19)
                        .addComponent(jLabel1)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCelularObrigatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCelularObrigatorio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxModalidadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonPesquisar))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRgDoResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRgDoResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRgDoResponsavelActionPerformed

    private void jTextFieldNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeAlunoActionPerformed

    private void jTextFieldNomeResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeResponsavelActionPerformed

    private void jTextFieldRgAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRgAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRgAlunoActionPerformed

    private void jTextFieldIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdadeActionPerformed

    private void jTextFieldCelularObrigatorio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCelularObrigatorio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCelularObrigatorio2ActionPerformed

    private void jTextFieldTelefoneFixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneFixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneFixoActionPerformed

    private void jTextFieldEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jTextFieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairroActionPerformed

    private void jTextFieldRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRuaActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jComboBoxModalidadeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModalidadeCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxModalidadeCadastroActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
        if((jTextFieldNomeAluno.getText().isEmpty())||(jTextFieldRgAluno.getText().isEmpty())||(jTextFieldIdade.getText().isEmpty())
            ||(jDateChooserDataNasc.getDate()==null)||(jDateChooserDataInicio.getDate()==null)
            ||(jTextFieldNomeResponsavel.getText().isEmpty())||(jTextFieldRgDoResponsavel.getText().isEmpty())
            ||(jTextFieldCelularObrigatorio1.getText().isEmpty())||(jTextFieldCelularObrigatorio2.getText().isEmpty()) 
            ||(jTextFieldEstado.getText().isEmpty())||(jTextFieldCidade.getText().isEmpty())
            ||(jTextFieldBairro.getText().isEmpty())||(jTextFieldRua.getText().isEmpty())
            ||(jTextFieldNumero.getText().isEmpty())){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos obrigatorios!");
        }
        else if((jComboBoxModalidadeCadastro.getSelectedItem().equals("Todas as modalidades"))
           ||(jComboBoxDia.getSelectedItem().equals("Todos os dias"))
           ||(jComboBoxHorario.getSelectedItem().equals("Todos os Horarios"))
           ||(jComboBoxProfessor.getSelectedItem().equals("Todos os professores"))){
            JOptionPane.showMessageDialog(rootPane, "Coloque opções de cadastro válidas!");
        }
        else{
            MaxAlunos= conecta.somaSQL("select sum(qtdAlunos)from CADASTROTURMAS where modalidade like'%"+jComboBoxModalidadeCadastro.getSelectedItem()+"%'"
                                + "and DIA like'%"+jComboBoxDia.getSelectedItem()+"%'"
                                + "and HORARIO like'%"+jComboBoxHorario.getSelectedItem()+"%'"
                                + "and PROFESSOR like'%"+jComboBoxProfessor.getSelectedItem()+"%'");
       
            AlunosDaTurma= conecta.somaSQL("select sum(quantidade)from CadastroAlunos where modalidade like'%"+jComboBoxModalidadeCadastro.getSelectedItem()+"%'"
                                + "and DIA like'%"+jComboBoxDia.getSelectedItem()+"%'"
                                + "and HORARIO like'%"+jComboBoxHorario.getSelectedItem()+"%'"
                                + "and PROFESSOR like'%"+jComboBoxProfessor.getSelectedItem()+"%'");

            total=MaxAlunos-AlunosDaTurma;  
            jTextFieldVagas.setText(String.valueOf(total));
       if(total>0){
           try {
            //cadastrar na tabela de alunos
            PreparedStatement pst=conecta.conn.prepareStatement("insert into CadastroAlunos(nome_aluno,nome_responsavel,"
            + "RG_aluno,RG_responsavel,data_inicio,idade_aluno,data_nascimento,rua,numero,bairro,cidade,estado,telefone,outro_telefone,"
            + "telefone_Fixo,modalidade,DIA,HORARIO,PROFESSOR,quantidade)"
            + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,jTextFieldNomeAluno.getText());
            pst.setString(2,jTextFieldNomeResponsavel.getText());
            pst.setString(3,jTextFieldRgAluno.getText());
            pst.setString(4,jTextFieldRgDoResponsavel.getText());
            pst.setString(5, DateFormat.format(jDateChooserDataNasc.getDate()));
            pst.setString(6,jTextFieldIdade.getText());
            pst.setString(7, DateFormat.format(jDateChooserDataInicio.getDate()));
            pst.setString(8,jTextFieldRua.getText());
            pst.setString(9,jTextFieldNumero.getText());
            pst.setString(10,jTextFieldBairro.getText());
            pst.setString(11,jTextFieldCidade.getText());
            pst.setString(12,jTextFieldEstado.getText());
            pst.setString(13,jTextFieldCelularObrigatorio1.getText());
            pst.setString(14,jTextFieldCelularObrigatorio2.getText());
            pst.setString(15,jTextFieldTelefoneFixo.getText());
            pst.setString(16, (String) jComboBoxModalidadeCadastro.getSelectedItem());
            pst.setString(17, (String) jComboBoxDia.getSelectedItem());
            pst.setString(18, (String) jComboBoxHorario.getSelectedItem());
            pst.setString(19, (String) jComboBoxProfessor.getSelectedItem());
            pst.setString(20, "1");
            
            pst.executeUpdate();
            
            //cadastrar na tabela de folha de pagamento
            PreparedStatement pst2=conecta.conn.prepareStatement("insert into FOLHADEPAGAMENTO(NOME_ALUNO,RG_ALUNO,"
            + "MODALIDADE,DIA,HORARIO,PROFESSOR)"
            + "values(?,?,?,?,?,?)");
            pst2.setString(1,jTextFieldNomeAluno.getText());
            pst2.setString(2,jTextFieldRgAluno.getText());
            pst2.setString(3, (String) jComboBoxModalidadeCadastro.getSelectedItem());
            pst2.setString(4, (String) jComboBoxDia.getSelectedItem());
            pst2.setString(5, (String) jComboBoxHorario.getSelectedItem());
            pst2.setString(6, (String) jComboBoxProfessor.getSelectedItem());
            
            pst2.executeUpdate();
            
            JOptionPane.showMessageDialog(rootPane, "Aluno cadastrado com sucesso!");
            EsvaziarCamposDeTexto();
            preencherTabelaAlunosModalidadeGeral();
            fazerSomaModalidadeGeral();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro na inserção!\n Erro:"+ex);
            }
        }
       else{
            try {
                //cadastrar na tabela fila de espera
                PreparedStatement pst=conecta.conn.prepareStatement("insert into FILADEESPERA(nome_aluno,nome_responsavel,"
                        + "RG_aluno,RG_responsavel,data_inicio,idade_aluno,data_nascimento,rua,numero,bairro,cidade,estado,telefone,outro_telefone,"
                        + "telefone_Fixo,modalidade,DIA,HORARIO,PROFESSOR,quantidade)"
                        + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1,jTextFieldNomeAluno.getText());
                pst.setString(2,jTextFieldNomeResponsavel.getText());
                pst.setString(3,jTextFieldRgAluno.getText());
                pst.setString(4,jTextFieldRgDoResponsavel.getText());
                pst.setString(5, DateFormat.format(jDateChooserDataNasc.getDate()));
                pst.setString(6,jTextFieldIdade.getText());
                pst.setString(7, DateFormat.format(jDateChooserDataInicio.getDate()));
                pst.setString(8,jTextFieldRua.getText());
                pst.setString(9,jTextFieldNumero.getText());
                pst.setString(10,jTextFieldBairro.getText());
                pst.setString(11,jTextFieldCidade.getText());
                pst.setString(12,jTextFieldEstado.getText());
                pst.setString(13,jTextFieldCelularObrigatorio1.getText());
                pst.setString(14,jTextFieldCelularObrigatorio2.getText());
                pst.setString(15,jTextFieldTelefoneFixo.getText());
                pst.setString(16, (String) jComboBoxModalidadeCadastro.getSelectedItem());
                pst.setString(17, (String) jComboBoxDia.getSelectedItem());
                pst.setString(18, (String) jComboBoxHorario.getSelectedItem());
                pst.setString(19, (String) jComboBoxProfessor.getSelectedItem());
                pst.setString(20, "1");
                    
                pst.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Turma cheia\nAluno preenchido na fila de espera!");
                EsvaziarCamposDeTexto();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao preencher na fila de espera:"+ex);
                }
            }
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:       
        if(jComboBoxModalidadeCadastro.getSelectedItem().equals("Todas as modalidades")){
            preencherTabelaAlunosModalidadeGeral();
            fazerSomaModalidadeGeral();
            try {
                fazerSomaVagasDaTurma();
            } catch (SQLException ex) {
                Logger.getLogger(CadastrarAlunos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            preencherTabelaAlunosModalidade();
            fazerSomaModalidade();
            try {
                fazerSomaVagasDaTurma();
            } catch (SQLException ex) {
                Logger.getLogger(CadastrarAlunos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
        if((jTextFieldNomeAluno.getText().isEmpty())||(jTextFieldRgAluno.getText().isEmpty())||(jTextFieldIdade.getText().isEmpty())
            ||(jDateChooserDataNasc.getDate()==null)||(jDateChooserDataInicio.getDate()==null)
            ||(jTextFieldNomeResponsavel.getText().isEmpty())||(jTextFieldRgDoResponsavel.getText().isEmpty())
            ||(jTextFieldCelularObrigatorio1.getText().isEmpty())||(jTextFieldCelularObrigatorio2.getText().isEmpty()) 
            ||(jTextFieldEstado.getText().isEmpty())||(jTextFieldCidade.getText().isEmpty())
            ||(jTextFieldBairro.getText().isEmpty())||(jTextFieldRua.getText().isEmpty())
            ||(jTextFieldNumero.getText().isEmpty())
            ||(jComboBoxModalidadeCadastro.getSelectedItem()==null)){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos obrigatorios!");
        }
        else if((jComboBoxModalidadeCadastro.getSelectedItem().equals("Todas as modalidades"))
           ||(jComboBoxDia.getSelectedItem().equals("Todos os dias"))
           ||(jComboBoxHorario.getSelectedItem().equals("Todos os Horarios"))
           ||(jComboBoxProfessor.getSelectedItem().equals("Todos os professores"))){
            JOptionPane.showMessageDialog(rootPane, "Coloque opções de cadastro válidas!");
        }
        else{    
        try {
            PreparedStatement pst=conecta.conn.prepareStatement("update CadastroAlunos set nome_aluno=?,nome_responsavel=?,"
            + "RG_aluno=?,RG_responsavel=?,data_inicio=?,idade_aluno=?,data_nascimento=?,rua=?,numero=?,bairro=?,cidade=?,estado=?,"
            + "telefone=?,outro_telefone=?,telefone_Fixo=?,modalidade=?,dia=?,horario=?,professor=? where numeroDeInscricao=?");
            pst.setString(1,jTextFieldNomeAluno.getText());
            pst.setString(2,jTextFieldNomeResponsavel.getText());
            pst.setString(3,jTextFieldRgAluno.getText());
            pst.setString(4,jTextFieldRgDoResponsavel.getText());
            pst.setString(5, DateFormat.format(jDateChooserDataNasc.getDate()));
            pst.setString(6,jTextFieldIdade.getText());
            pst.setString(7, DateFormat.format(jDateChooserDataInicio.getDate()));
            pst.setString(8,jTextFieldRua.getText());
            pst.setString(9,jTextFieldNumero.getText());
            pst.setString(10,jTextFieldBairro.getText());
            pst.setString(11,jTextFieldCidade.getText());
            pst.setString(12,jTextFieldEstado.getText());
            pst.setString(13,jTextFieldCelularObrigatorio1.getText());
            pst.setString(14,jTextFieldCelularObrigatorio2.getText());
            pst.setString(15,jTextFieldTelefoneFixo.getText());
            pst.setString(16, (String) jComboBoxModalidadeCadastro.getSelectedItem());
            pst.setString(17, (String) jComboBoxDia.getSelectedItem());
            pst.setString(18, (String) jComboBoxHorario.getSelectedItem());
            pst.setString(19, (String) jComboBoxProfessor.getSelectedItem());
            pst.setString(20,jTextFieldNumeroDeInscricao.getText());

            pst.executeUpdate();
            
            PreparedStatement pst2=conecta.conn.prepareStatement("update FOLHADEPAGAMENTO set nome_aluno=?,RG_aluno=?,"
            + "modalidade=?,dia=?,horario=?,professor=? where numeroDeInscricao=?");
            pst2.setString(1,jTextFieldNomeAluno.getText());
            pst2.setString(2,jTextFieldRgAluno.getText());
            pst2.setString(3, (String) jComboBoxModalidadeCadastro.getSelectedItem());
            pst2.setString(4, (String) jComboBoxDia.getSelectedItem());
            pst2.setString(5, (String) jComboBoxHorario.getSelectedItem());
            pst2.setString(6, (String) jComboBoxProfessor.getSelectedItem());
            pst2.setString(7,jTextFieldNumeroDeInscricao.getText());

            pst2.executeUpdate();
            
            JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");
            EsvaziarCamposDeTexto();
            preencherTabelaAlunosModalidadeGeral();
            fazerSomaModalidade();
            jButtonCadastrar.setEnabled(true);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao editar\n Erro:"+ex);
        }
    }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldCelularObrigatorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCelularObrigatorio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCelularObrigatorio1ActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        conecta.executaSQLExcluir("INSERT INTO ExALUNOS SELECT * FROM CADASTROALUNOS where NUMERODEINSCRICAO like'"+jTextFieldNumeroDeInscricao.getText()+"'");
        conecta.executaSQLExcluir("delete from CadastroAlunos where NUMERODEINSCRICAO='"+jTextFieldNumeroDeInscricao.getText()+"'");
        conecta.executaSQLExcluir("delete from FOLHADEPAGAMENTO where NUMERODEINSCRICAO='"+jTextFieldNumeroDeInscricao.getText()+"'");
        JOptionPane.showMessageDialog(rootPane,"Excluido com sucesso!\nTransferido pra tabela de Ex Alunos");
        //JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");
            
        EsvaziarCamposDeTexto();
        preencherTabelaAlunosModalidadeGeral();
        fazerSomaModalidade();
        jTextFieldTelefoneFixo.setText("");
        jButtonCadastrar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextFieldNumeroDeInscricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDeInscricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroDeInscricaoActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked
        ModeloTabela ModeloTabela=new ModeloTabela(dados,Colunas);
        jTableAlunos.getModel();
        int index = jTableAlunos.getSelectedRow();
        Date data_inicio=null,data_nasc=null;
                
        String numeroDeInscricao=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 0);
        jTextFieldNumeroDeInscricao.setText(numeroDeInscricao);
        String nome_aluno=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 5);
        jTextFieldNomeAluno.setText(nome_aluno);
        String nome_responsavel=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 11);
        jTextFieldNomeResponsavel.setText(nome_responsavel);
        String RG_aluno=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 6);
        jTextFieldRgAluno.setText(RG_aluno);
        String RG_responsavel=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 12);
        jTextFieldRgDoResponsavel.setText(RG_responsavel);
        String idade=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 8);
        jTextFieldIdade.setText(idade);
        String rua=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 18);
        jTextFieldRua.setText(rua);
        String numero=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 19);
        jTextFieldNumero.setText(numero);
        String bairro=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 17);
        jTextFieldBairro.setText(bairro);
        String cidade=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 16);
        jTextFieldCidade.setText(cidade);
        String estado=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 15);
        jTextFieldEstado.setText(estado);
        String telefone=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 8);
        jTextFieldCelularObrigatorio1.setText(telefone);
        String outro_telefone=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 9);
        jTextFieldCelularObrigatorio2.setText(outro_telefone);
        String telefone_Fixo=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 10);
        jTextFieldTelefoneFixo.setText(telefone_Fixo);
        String modalidade=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 1);
        jComboBoxModalidadeCadastro.setSelectedItem(modalidade);
        preencherJComboBoxDia();
        String dia=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 2);
        jComboBoxDia.setSelectedItem(dia);
        String horario=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 3);
        jComboBoxHorario.setSelectedItem(horario);
        String professor=""+jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 4);
        jComboBoxProfessor.setSelectedItem(professor);
        try {
            data_inicio = new SimpleDateFormat("dd-MM-yyyy").parse((String)jTableAlunos.getValueAt(index, 13));
            data_nasc = new SimpleDateFormat("dd-MM-yyyy").parse((String)jTableAlunos.getValueAt(index, 14));
        } catch (NullPointerException ex) {
            System.out.println("oi");
        } catch (ParseException ex) {
            Logger.getLogger(FolhaDePagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDateChooserDataNasc.setDate(data_inicio);
        jDateChooserDataInicio.setDate(data_nasc);
        jButtonCadastrar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableAlunosMouseClicked

    private void jTableAlunosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableAlunosMouseEntered

    private void jComboBoxModalidadeCadastroPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxModalidadeCadastroPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
      preencherJComboBoxDia();
    }//GEN-LAST:event_jComboBoxModalidadeCadastroPopupMenuWillBecomeInvisible

    private void jComboBoxDiaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxDiaPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        preencherJComboBoxHorario();
    }//GEN-LAST:event_jComboBoxDiaPopupMenuWillBecomeInvisible

    private void jComboBoxHorarioPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxHorarioPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        preencherJComboBoxProfessor();
    }//GEN-LAST:event_jComboBoxHorarioPopupMenuWillBecomeInvisible

    private void jComboBoxProfessorPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxProfessorPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProfessorPopupMenuWillBecomeInvisible

    private void jTextFieldVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVagasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVagasActionPerformed
    public void preencherTabela(String SQL){
        ArrayList dados=new ArrayList();
        String[] Colunas=new String[]{"Nº Inscrição","Modalidade","Dia","Horário","Professor","Aluno","RG do aluno","Idade","Celular",
            "Outro celular","Telefone fixo","Nome do responsável","RG do responsável","Data de início","Data de nascimento","Estado","Cidade",
            "Bairro","Rua","Número"};
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
            dados.add(new Object[]{conecta.rs.getInt("numeroDeInscricao"),conecta.rs.getString("modalidade"),conecta.rs.getString("DIA"),
                conecta.rs.getString("HORARIO"),conecta.rs.getString("PROFESSOR"),conecta.rs.getString("nome_aluno"),
                conecta.rs.getString("RG_aluno"),conecta.rs.getString("idade_aluno"),conecta.rs.getString("telefone"),
                conecta.rs.getString("outro_telefone"),conecta.rs.getString("telefone_Fixo"),conecta.rs.getString("nome_responsavel"),
                conecta.rs.getString("RG_responsavel"),conecta.rs.getString("data_inicio"),conecta.rs.getString("data_nascimento"),
                conecta.rs.getString("estado"),conecta.rs.getString("cidade"),conecta.rs.getString("bairro"),conecta.rs.getString("rua"),
                conecta.rs.getString("numero")});
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a tabela ou tabela vazia (ArrayList)!\n Erro:"+ex);
        }
        ModeloTabela ModeloTabela=new ModeloTabela(dados,Colunas);
        jTableAlunos.setModel(ModeloTabela);
        /*jTableAlunos.getColumnModel().getColumn(0).setPreferredWidth(65);
        jTableAlunos.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTableAlunos.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTableAlunos.getColumnModel().getColumn(3).setPreferredWidth(65);
        jTableAlunos.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTableAlunos.getColumnModel().getColumn(5).setPreferredWidth(120);
        jTableAlunos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);*/
    }
    public void preencherTabelaAlunosModalidade(){
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String date=(DateFormat.format(jDateChooserDataNasc.getDate()));
        System.out.println(date);
        preencherTabela("select * from CadastroAlunos where nome_aluno like'%"+jTextFieldNomeAluno.getText()+"%'"
                        + "and nome_responsavel like'%"+jTextFieldNomeResponsavel.getText()+"%'"
                        + "and RG_aluno like'%"+jTextFieldRgAluno.getText()+"%'"
                        + "and RG_responsavel like'%"+jTextFieldRgDoResponsavel.getText()+"%'"
                        //+ "and data_inicio like'%"+jDateChooserDataInicio.getDate()+"%'"
                        + "and idade_aluno like'%"+jTextFieldIdade.getText()+"%'"
                                
                        + "and data_nascimento like'%"+date+"%'"
                        + "and rua like'%"+jTextFieldRua.getText()+"%'"
                        + "and numero like'%"+jTextFieldNumero.getText()+"%'"
                        + "and bairro like'%"+jTextFieldBairro.getText()+"%'"
                        + "and cidade like'%"+jTextFieldCidade.getText()+"%'"
                        + "and estado like'%"+jTextFieldEstado.getText()+"%'"
                        + "and telefone like'%"+jTextFieldCelularObrigatorio1.getText()+"%'"
                        + "and outro_telefone like'%"+jTextFieldCelularObrigatorio2.getText()+"%'"
                        + "and telefone_Fixo like'%"+jTextFieldTelefoneFixo.getText()+"%'"
                        + "and modalidade like'%"+jComboBoxModalidadeCadastro.getSelectedItem()+"%'"
                        /*+ "and dia like'%"+jComboBoxDia.getSelectedItem()+"%'"*/);
    }
    public void preencherTabelaAlunosModalidadeGeral(){
        //
        preencherTabela("select * from CadastroAlunos");           
    }
    public void preencherJComboBoxModalidade(){
        conecta.conexao();
        conecta.executaSQL("select distinct MODALIDADE from CADASTROTURMAS order by modalidade");
        try {
            conecta.rs.first();
            jComboBoxModalidadeCadastro.removeAllItems();
            jComboBoxModalidadeCadastro.addItem("Todas as modalidades");
            do{
                if(!conecta.rs.getString("modalidade").isEmpty()){
                    jComboBoxModalidadeCadastro.addItem(conecta.rs.getString("modalidade"));
                }
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(rootPane,"Erro ao preencher JComboBox!\n Erro:"+ ex);
        }
    }
    public void preencherJComboBoxDia(){
        conecta.conexao();
        conecta.executaSQL("select distinct dia from CADASTROTURMAS where MODALIDADE like'%"+jComboBoxModalidadeCadastro.getSelectedItem()+"%'");
        try {
            conecta.rs.first();
            jComboBoxDia.removeAllItems();
            jComboBoxDia.addItem("Todos os dias");
            do{
                if(!conecta.rs.getString("DIA").isEmpty()){
                    jComboBoxDia.addItem(conecta.rs.getString("DIA"));
                }
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(rootPane,"Erro ao preencher JComboBoxDia!\n Erro:"+ ex);
        }
    }
    public void preencherJComboBoxHorario(){
        conecta.conexao();
        conecta.executaSQL("select distinct HORARIO from CADASTROTURMAS where MODALIDADE like'%"+jComboBoxModalidadeCadastro.getSelectedItem()+"%'"
                            + "and DIA like'%"+jComboBoxDia.getSelectedItem()+"%'");
        try {
            conecta.rs.first();
            jComboBoxHorario.removeAllItems();
            jComboBoxHorario.addItem("Todos os Horarios");
            do{
                if(!conecta.rs.getString("HORARIO").isEmpty()){
                    jComboBoxHorario.addItem(conecta.rs.getString("HORARIO"));
                }
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(rootPane,"Erro ao preencher JComboBoxHorario!\n Erro:"+ ex);
        }
    }
    public void preencherJComboBoxProfessor(){
        conecta.conexao();
        conecta.executaSQL("select distinct PROFESSOR from CADASTROTURMAS where MODALIDADE like'%"+jComboBoxModalidadeCadastro.getSelectedItem()+"%'"
                            + "and DIA like'%"+jComboBoxDia.getSelectedItem()+"%'"
                            + "and HORARIO like'%"+jComboBoxHorario.getSelectedItem()+"%'");
        try {
            conecta.rs.first();
            jComboBoxProfessor.removeAllItems();
            jComboBoxProfessor.addItem("Todos os professores");
            do{
                if(!conecta.rs.getString("PROFESSOR").isEmpty()){
                    jComboBoxProfessor.addItem(conecta.rs.getString("PROFESSOR"));
                }
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(rootPane,"Erro ao preencher JComboBoxProfessor!\n Erro:"+ ex);
        }
    }
    public void fazerSomaModalidade(){
        total= conecta.somaSQL("select sum(quantidade)from CadastroAlunos where nome_aluno like'%"+jTextFieldNomeAluno.getText()+"%'"
                                + "and nome_responsavel like'%"+jTextFieldNomeResponsavel.getText()+"%'"
                                + "and RG_aluno like'%"+jTextFieldRgAluno.getText()+"%'"
                                + "and RG_responsavel like'%"+jTextFieldRgDoResponsavel.getText()+"%'"
                                + "and data_inicio like'%"+jDateChooserDataInicio.getDate()+"%'"
                                + "and idade_aluno like'%"+jTextFieldIdade.getText()+"%'"
                                + "and data_nascimento like'%"+jDateChooserDataNasc.getDate()+"%'"
                                + "and rua like'%"+jTextFieldRua.getText()+"%'"
                                + "and numero like'%"+jTextFieldNumero.getText()+"%'"
                                + "and bairro like'%"+jTextFieldBairro.getText()+"%'"
                                + "and cidade like'%"+jTextFieldCidade.getText()+"%'"
                                + "and estado like'%"+jTextFieldEstado.getText()+"%'"
                                + "and telefone like'%"+jTextFieldCelularObrigatorio1.getText()+"%'"
                                + "and outro_telefone like'%"+jTextFieldCelularObrigatorio2.getText()+"%'"
                                + "and telefone_Fixo like'%"+jTextFieldTelefoneFixo.getText()+"%'"
                                + "and modalidade like'%"+jComboBoxModalidadeCadastro.getSelectedItem()+"%'");
                                jTextFieldTotal.setText(String.valueOf(total));
    }
    public void fazerSomaModalidadeGeral(){
        total= conecta.somaSQL("select sum(quantidade)from CadastroAlunos where nome_aluno like'%"+jTextFieldNomeAluno.getText()+"%'"
                                + "and nome_responsavel like'%"+jTextFieldNomeResponsavel.getText()+"%'"
                                + "and RG_aluno like'%"+jTextFieldRgAluno.getText()+"%'"
                                + "and RG_responsavel like'%"+jTextFieldRgDoResponsavel.getText()+"%'"
                                + "and data_inicio like'%"+jDateChooserDataInicio.getDate()+"%'"
                                + "and idade_aluno like'%"+jTextFieldIdade.getText()+"%'"
                                + "and data_nascimento like'%"+jDateChooserDataNasc.getDate()+"%'"
                                + "and rua like'%"+jTextFieldRua.getText()+"%'"
                                + "and numero like'%"+jTextFieldNumero.getText()+"%'"
                                + "and bairro like'%"+jTextFieldBairro.getText()+"%'"
                                + "and cidade like'%"+jTextFieldCidade.getText()+"%'"
                                + "and estado like'%"+jTextFieldEstado.getText()+"%'"
                                + "and telefone like'%"+jTextFieldCelularObrigatorio1.getText()+"%'"
                                + "and outro_telefone like'%"+jTextFieldCelularObrigatorio2.getText()+"%'"
                                + "and telefone_Fixo like'%"+jTextFieldTelefoneFixo.getText()+"%'"
                                + "and modalidade like'%"+jComboBoxModalidadeCadastro.getSelectedItem()+"%'");
                                jTextFieldTotal.setText(String.valueOf(total));
    }
    public void EsvaziarCamposDeTexto(){
       jTextFieldNomeAluno.setText("");
       jTextFieldNomeResponsavel.setText("");
       jTextFieldRgAluno.setText("");
       jTextFieldRgDoResponsavel.setText("");
       jDateChooserDataInicio.getDate();
       jTextFieldIdade.setText("");
       jDateChooserDataNasc.getDate();
       jTextFieldRua.setText("");
       jTextFieldNumero.setText("");
       jTextFieldBairro.setText("");
       jTextFieldCidade.setText("");
       jTextFieldEstado.setText("");
       jTextFieldCelularObrigatorio1.setText("");
       jTextFieldCelularObrigatorio2.setText("");
       jTextFieldTelefoneFixo.setText("");
       jDateChooserDataInicio.setDate(null);
       jDateChooserDataNasc.setDate(null);
    }
    public void fazerSomaVagasDaTurma() throws SQLException{
            MaxAlunos= conecta.somaSQL("select sum(qtdAlunos)from CADASTROTURMAS where modalidade like'%"+jComboBoxModalidadeCadastro.getSelectedItem()+"%'"
                                + "and DIA like'%"+jComboBoxDia.getSelectedItem()+"%'"
                                + "and HORARIO like'%"+jComboBoxHorario.getSelectedItem()+"%'"
                                + "and PROFESSOR like'%"+jComboBoxProfessor.getSelectedItem()+"%'");
       
            AlunosDaTurma= conecta.somaSQL("select sum(quantidade)from CadastroAlunos where modalidade like'%"+jComboBoxModalidadeCadastro.getSelectedItem()+"%'"
                                + "and DIA like'%"+jComboBoxDia.getSelectedItem()+"%'"
                                + "and HORARIO like'%"+jComboBoxHorario.getSelectedItem()+"%'"
                                + "and PROFESSOR like'%"+jComboBoxProfessor.getSelectedItem()+"%'");

            total=MaxAlunos-AlunosDaTurma;  
            jTextFieldVagas.setText(String.valueOf(total));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAlunos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxHorario;
    private javax.swing.JComboBox<String> jComboBoxModalidadeCadastro;
    private javax.swing.JComboBox<String> jComboBoxProfessor;
    private com.toedter.calendar.JDateChooser jDateChooserDataInicio;
    private com.toedter.calendar.JDateChooser jDateChooserDataNasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableA;
    private javax.swing.JTable jTableAlunos;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCelularObrigatorio1;
    private javax.swing.JTextField jTextFieldCelularObrigatorio2;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNomeAluno;
    private javax.swing.JTextField jTextFieldNomeResponsavel;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldNumeroDeInscricao;
    private javax.swing.JTextField jTextFieldRgAluno;
    private javax.swing.JTextField jTextFieldRgDoResponsavel;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldTelefoneFixo;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldVagas;
    // End of variables declaration//GEN-END:variables
}