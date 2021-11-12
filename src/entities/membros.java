package entities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class membros {
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private String nascimento;

    public membros(String name, String nascimento) {
        this.name = name;
        this.nascimento = nascimento;
    }

    public String getName() {
        return name;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public int getIdade() throws ParseException {
        DateFormat sdf2 = new SimpleDateFormat("yyyMMdd");
        Date now = new Date();
        Date nasc = sdf1.parse(nascimento);
        int d1 = Integer.parseInt(sdf2.format(nasc));
        int d2 = Integer.parseInt(sdf2.format(now));
        int idade = (d2-d1)/10000;
        return idade;
    }
}