package com.plan111.testing;

import com.plan111.dao.PersonalEntregaDAO;
import com.plan111.modelo.PersonalEntrega;

/**
 * @author Guido
 */

public class CargarPersonalEntrega {
  public static void main(String[] args) {
    PersonalEntrega cadete1 = new PersonalEntrega();
    cadete1.setNumeroCarnet(123);

    PersonalEntregaDAO nuevoCadete = new PersonalEntregaDAO();
    nuevoCadete.registrarPersonalEntrega(cadete1);
  }
}
