package Desafio

fun main() {

    val manager = DigitalHouseManager();


    val profTitular1 = manager.registrarProfessorTitular("Arthas", "King", 5, "Espadas");
    val profTitular2 = manager.registrarProfessorTitular("Uther", "Mentor", 2, "Espadas e Maças");
    val profAdjunto1 = manager.registrarProfessorAdjunto("Lich King", "Frostmourne", 3, 10);
    val profAdjunto2 = manager.registrarProfessorAdjunto("Sylvanas", "Sem Noção", 4, 20);
    val curso1 = manager.registrarCurso("Shadowlands", 20001, 3, 40);
    val curso2 = manager.registrarCurso("Wrath of the Lich King", 20002, 2, 40);

    if (profTitular1 != null && profAdjunto1 != null && curso1 != null) {
        manager.alocarProfessores(curso1.codigo, profTitular1.codigo, profAdjunto1.codigo)
    }
    else{
        println("Professores ou curso estão sumidos!");
        return;
    }
    if (profTitular2 != null && profAdjunto2 != null && curso2 != null) {
        manager.alocarProfessores(curso2.codigo, profTitular2.codigo, profAdjunto2.codigo);
    }
    else{
        println("Professores ou curso estão sumidos!");
        return;
    }



    var aluno1 = Aluno(1, "Arthas", "Menethil")
    var aluno2 = Aluno(2, "Ashbringer", "Legends")
    manager.matricularAluno(aluno1.codigo, curso1.codigo);
    manager.matricularAluno(aluno2.codigo, curso1.codigo);
    var aluno3 = Aluno(3, "Aluno 3", "Teste")
    var aluno4 = Aluno(4, "Aluno 4", "Teste")
    var aluno5 = Aluno(5, "Aluno 5", "Teste")
    manager.matricularAluno(aluno3.codigo, curso2.codigo);
    manager.matricularAluno(aluno4.codigo, curso2.codigo);
    manager.matricularAluno(aluno5.codigo, curso2.codigo);



}