class Aluno extends Pessoa {
    private int matricula;
    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    
    public int getMatricula(int matricula) {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    @Override
     public String getInfoAdicional() {
            return "Matricula: " + matricula;
        }
}