public class Principal {
    public static void main(String[] args) {


//     System.out.println("\nBemvindo a Secretaria\n\n");
//     System.out.println("Escolhe um utilizador:\n" +
//             "1-Atendente\n" +
//             "2-Aluno");
//
//     System.out.println("\n\n\nCoisas que o Atendente pode Fazer:\n" +
//             "1-Matricular\n" +
//             "2-RenovarMatricula\n" +
//             "3-AnularMatricula\n" +
//             "4-Ver Lista De Alunos: Ano e Curso");
//
//     System.out.println("\n\nCoisas que o Aluno pode fazer\n" +
//             "1-Ver Lista De Alunos: Ano e Curso");


        Curso novoCurso = new Curso("EISC", 2);
        System.out.println("\nCurso Criado: " + novoCurso.getNomeCurso() + "__" + novoCurso.getAnoCurso() + " Ano");

    }
}
