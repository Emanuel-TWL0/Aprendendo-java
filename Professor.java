class Professor extends Pessoa {
    private String disciplina;
    
    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }
    
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina() {
        this.disciplina = disciplina;
    }
    
    
@Override public String toString() {
        return "Disciplina: "+disciplina;
}
    
}