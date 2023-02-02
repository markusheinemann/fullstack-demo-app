package com.accenture.kickstart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "ARTIKELGRUPPE")
public class Artikelgruppe {
    
    @Id
    private Integer ARTIKELGRUPPE_ID;
    private String AG_BEZEICHNUNG;


    public Artikelgruppe() {
    }


    public Integer getARTIKELGRUPPE_ID() {
        return this.ARTIKELGRUPPE_ID;
    }

    public void setARTIKELGRUPPE_ID(Integer ARTIKELGRUPPE_ID) {
        this.ARTIKELGRUPPE_ID = ARTIKELGRUPPE_ID;
    }

    public String getAG_BEZEICHNUNG() {
        return this.AG_BEZEICHNUNG;
    }

    public void setAG_BEZEICHNUNG(String AG_BEZEICHNUNG) {
        this.AG_BEZEICHNUNG = AG_BEZEICHNUNG;
    }
}
