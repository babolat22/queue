/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.ImageIcon;

/**
 *
 * @author Martin
 */
public class MenuPrincipal extends javax.swing.JFrame {
     
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setTitle("Universidad");//Poner titulo a jframe
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/universidad.png")).getImage()) ;// poner imagen a jframe
    }

    //@Override
 //   public void setIconImage(Image image) {
    //    setIconImage(new ImageIcon(getClass().getResource("../imagenes/icono.png")).getImage()) ;
             //To change body of generated methods, choose Tools | Templates.
    
  // }
    
  //  @Override
   // public  Image getIconImage(){
   // Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/imagenUniverdidad.png"));
  //  return retValue;
//
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenuItem();
        jmAlumnos = new javax.swing.JMenu();
        mAlumnos = new javax.swing.JMenuItem();
        jmMaterias = new javax.swing.JMenu();
        mMaterias = new javax.swing.JMenuItem();
        mInscripciones = new javax.swing.JMenu();
        jmIncripciones = new javax.swing.JMenuItem();
        jmCursadas = new javax.swing.JMenu();
        mCargarNotas = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        mAlumnoXMaterias = new javax.swing.JMenuItem();
        mMateriasXAlumnos = new javax.swing.JMenuItem();
        mListadoAlumnos = new javax.swing.JMenuItem();
        mListadoMaterias = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );

        jmArchivo.setText("Archivo");

        mSalir.setText("Salir");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        jmArchivo.add(mSalir);

        jMenuBar1.add(jmArchivo);

        jmAlumnos.setText("Alumnos");

        mAlumnos.setText("Formulario ABM alumnos");
        mAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAlumnosActionPerformed(evt);
            }
        });
        jmAlumnos.add(mAlumnos);

        jMenuBar1.add(jmAlumnos);

        jmMaterias.setText("Materias");
        jmMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMateriasActionPerformed(evt);
            }
        });

        mMaterias.setText("Formulario ABM materias");
        mMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMateriasActionPerformed(evt);
            }
        });
        jmMaterias.add(mMaterias);

        jMenuBar1.add(jmMaterias);

        mInscripciones.setText("Inscripciones");

        jmIncripciones.setText("Inscripciones");
        jmIncripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmIncripcionesActionPerformed(evt);
            }
        });
        mInscripciones.add(jmIncripciones);

        jMenuBar1.add(mInscripciones);

        jmCursadas.setText("Carga de notas");

        mCargarNotas.setText("Cargar notas");
        mCargarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCargarNotasActionPerformed(evt);
            }
        });
        jmCursadas.add(mCargarNotas);

        jMenuBar1.add(jmCursadas);

        jmConsultas.setText("Consultas");

        mAlumnoXMaterias.setText("Alumnos por materia");
        mAlumnoXMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAlumnoXMateriasActionPerformed(evt);
            }
        });
        jmConsultas.add(mAlumnoXMaterias);

        mMateriasXAlumnos.setText("Materias por alumno");
        mMateriasXAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMateriasXAlumnosActionPerformed(evt);
            }
        });
        jmConsultas.add(mMateriasXAlumnos);

        mListadoAlumnos.setText("Listado de alumnos");
        mListadoAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListadoAlumnosActionPerformed(evt);
            }
        });
        jmConsultas.add(mListadoAlumnos);

        mListadoMaterias.setText("Listado de materias");
        mListadoMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListadoMateriasActionPerformed(evt);
            }
        });
        jmConsultas.add(mListadoMaterias);

        jMenuBar1.add(jmConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void mMateriasXAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMateriasXAlumnosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaMateriasXAlumno vmxa= new VistaMateriasXAlumno();
        vmxa.setVisible(true);
        escritorio.add(vmxa);
        escritorio.moveToFront(vmxa);
    }//GEN-LAST:event_mMateriasXAlumnosActionPerformed

    private void mAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAlumnosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumnos va= new VistaAlumnos();
        va.setVisible(true);
        escritorio.add(va);
        escritorio.moveToFront(va);
    }//GEN-LAST:event_mAlumnosActionPerformed

    private void jmMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMateriasActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jmMateriasActionPerformed

    private void mMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMateriasActionPerformed
        // TODO add your handling code here:
         escritorio.removeAll();
        escritorio.repaint();
        VistaMaterias vm= new VistaMaterias();
        vm.setVisible(true);
        escritorio.add(vm);
        escritorio.moveToFront(vm);
    }//GEN-LAST:event_mMateriasActionPerformed

    private void mAlumnoXMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAlumnoXMateriasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaListadoAlumnosXMateria vla= new VistaListadoAlumnosXMateria();
        vla.setVisible(true);
        escritorio.add(vla);
        escritorio.moveToFront(vla);        
    }//GEN-LAST:event_mAlumnoXMateriasActionPerformed

    private void mListadoAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListadoAlumnosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaListadoAlumnos vlisalu= new VistaListadoAlumnos();
        vlisalu.setVisible(true);
        escritorio.add(vlisalu);
        escritorio.moveToFront(vlisalu); 
    }//GEN-LAST:event_mListadoAlumnosActionPerformed

    private void mListadoMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListadoMateriasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaListadoMaterias vlmat= new VistaListadoMaterias();
        vlmat.setVisible(true);
        escritorio.add(vlmat);
        escritorio.moveToFront(vlmat); 
    }//GEN-LAST:event_mListadoMateriasActionPerformed

    private void mCargarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCargarNotasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaCargarNotas_v1 vcn= new VistaCargarNotas_v1();
        vcn.setVisible(true);
        escritorio.add(vcn);
        escritorio.moveToFront(vcn); 
    }//GEN-LAST:event_mCargarNotasActionPerformed

    private void jmIncripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmIncripcionesActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaInscripciones vins= new VistaInscripciones();
        vins.setVisible(true);
        escritorio.add(vins);
        escritorio.moveToFront(vins);  
    }//GEN-LAST:event_jmIncripcionesActionPerformed

    
    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        setDefaultCloseOperation(MenuPrincipal.EXIT_ON_CLOSE);
    }//GEN-LAST:event_mSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAlumnos;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmCursadas;
    private javax.swing.JMenuItem jmIncripciones;
    private javax.swing.JMenu jmMaterias;
    private javax.swing.JMenuItem mAlumnoXMaterias;
    private javax.swing.JMenuItem mAlumnos;
    private javax.swing.JMenuItem mCargarNotas;
    private javax.swing.JMenu mInscripciones;
    private javax.swing.JMenuItem mListadoAlumnos;
    private javax.swing.JMenuItem mListadoMaterias;
    private javax.swing.JMenuItem mMaterias;
    private javax.swing.JMenuItem mMateriasXAlumnos;
    private javax.swing.JMenuItem mSalir;
    // End of variables declaration//GEN-END:variables
}
