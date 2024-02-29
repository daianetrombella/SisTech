/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Daiane
 */
public class Venda {
    private int id;
    private String erp;
    private String scm;
    private String crm;
    private String sig;
    private String acomp;
    private String trein;
    private String sup;
    private String valor;
    private String contaId;

    public Venda(int id, String erp, String scm, String crm, String sig, String acomp, String trein, String sup, String valor, String contaId) {
        this.id = id;
        this.erp = erp;
        this.scm = scm;
        this.crm = crm;
        this.sig = sig;
        this.acomp = acomp;
        this.trein = trein;
        this.sup = sup;
        this.valor = valor;
        this.contaId = contaId;
    }
    
    public Venda(String erp, String scm, String crm, String sig, String acomp, String trein, String sup,String valor) {
        this.erp = erp;
        this.scm = scm;
        this.crm = crm;
        this.sig = sig;
        this.acomp = acomp;
        this.trein = trein;
        this.sup = sup;
        this.valor = valor;
    }

    public Venda() {
        
    }
    
    //public Venda(String contaId){
      //  this.contaId = contaId;
    //}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getErp() {
        return erp;
    }

    public void setErp(String erp) {
        this.erp = erp;
    }

    public String getScm() {
        return scm;
    }

    public void setScm(String scm) {
        this.scm = scm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig;
    }

    public String getAcomp() {
        return acomp;
    }

    public void setAcomp(String acomp) {
        this.acomp = acomp;
    }

    public String getTrein() {
        return trein;
    }

    public void setTrein(String trein) {
        this.trein = trein;
    }

    
    public String getSup() {
        return sup;
    }

    public void setSup(String sup) {
        this.sup = sup;
    }

    public String getContaId() {
        return contaId;
    }

    public void setContaId(String contaId) {
        this.contaId = contaId;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.erp);
        hash = 29 * hash + Objects.hashCode(this.scm);
        hash = 29 * hash + Objects.hashCode(this.crm);
        hash = 29 * hash + Objects.hashCode(this.sig);
        hash = 29 * hash + Objects.hashCode(this.acomp);
        hash = 29 * hash + Objects.hashCode(this.trein);
        hash = 29 * hash + Objects.hashCode(this.sup);
        hash = 29 * hash + Objects.hashCode(this.valor);
        hash = 29 * hash + Objects.hashCode(this.contaId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venda other = (Venda) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.contaId != other.contaId) {
            return false;
        }
        if (!Objects.equals(this.erp, other.erp)) {
            return false;
        }
        if (!Objects.equals(this.scm, other.scm)) {
            return false;
        }
        if (!Objects.equals(this.crm, other.crm)) {
            return false;
        }
        if (!Objects.equals(this.sig, other.sig)) {
            return false;
        }
        if (!Objects.equals(this.acomp, other.acomp)) {
            return false;
        }
        if (!Objects.equals(this.trein, other.trein)) {
            return false;
        }
        if (!Objects.equals(this.sup, other.sup)) {
            return false;
        }
        return Objects.equals(this.valor, other.valor);
    }

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", erp=" + erp + ", scm=" + scm + ", crm=" + crm + ", sig=" + sig + ", acomp=" + acomp + ", trein=" + trein + ", sup=" + sup + ", valor=" + valor + ", contaId=" + contaId + '}';
    }

}
