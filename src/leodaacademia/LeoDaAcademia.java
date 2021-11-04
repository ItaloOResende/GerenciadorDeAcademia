package leodaacademia;

import Utilitarios.conectaBanco;

public class LeoDaAcademia {

    public static void main(String[] args) {
        // TODO code application logic here
        conectaBanco conexao=new conectaBanco();
        conexao.conexaoInicial();
    }   
}