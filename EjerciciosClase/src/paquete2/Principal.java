/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/
        
        InstitucionEducativa i1 = new InstitucionEducativa();
        
        String nombreIns = "Colegio de Bachillerato Antonio Pena Celi";
        String tipoIns = "Particular";
        int numEstudiantes = 1000;
        int numDocentes = 30;
        int numSedes =2;
        
        i1.establecerNombre(nombreIns);
        i1.establecerTipoInstitucion(tipoIns);
        i1.establecerNumeroAlumnos(numEstudiantes);
        i1.establecerNumeroDocentes(numDocentes);
        i1.establecerNumeroSedes(numSedes);
        
        System.out.printf("Nombre de la Institucion: %s\nTipo de Institucion: "
                + "%s\nNumero de Alumnos: %d\nNumero de Docentes: %d\nNumero de"
                + " Sedes: %d\n"
                , i1.obtenerNombre(), i1.obtenerTipoInstitucion(),
                i1.obtenerNumeroAlumnos(), i1.obtenerNumeroDocentes()
                , i1.obtenerNumeroSedes());
    }
}
