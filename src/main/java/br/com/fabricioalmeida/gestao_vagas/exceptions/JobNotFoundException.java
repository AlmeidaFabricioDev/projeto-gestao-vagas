package br.com.fabricioalmeida.gestao_vagas.exceptions;
public class JobNotFoundException extends RuntimeException{
    public JobNotFoundException(){
        super("Job not found");
    }
}