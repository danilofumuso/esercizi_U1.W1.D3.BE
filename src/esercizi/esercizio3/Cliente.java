package esercizi.esercizio3;

import java.util.Date;

public class Cliente {
    private int idCliente;
    private String nomeCompleto;
    private String eMail;
    private Date data;

    public Cliente(int idCliente, String nomeCompleto, String eMail, Date data) {
        this.idCliente = idCliente;
        this.nomeCompleto = nomeCompleto;
        this.eMail = eMail;
        this.data = data;
    }
}
