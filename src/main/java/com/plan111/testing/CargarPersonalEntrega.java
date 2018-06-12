package com.plan111.testing;

import com.plan111.dao.imp.PersonalEntregaDAO;
import com.plan111.modelo.PersonalEntrega;

/**
 * @author Guido
 */

public class CargarPersonalEntrega {
  public static void main(String[] args) {
    PersonalEntrega cadete1 = new PersonalEntrega();
    cadete1.setNombre("Juan");
    cadete1.setNumeroCarnet(123456);

    PersonalEntregaDAO nuevoCadete = new PersonalEntregaDAO();
    nuevoCadete.registrarPersonalEntrega(cadete1);
  }
}
