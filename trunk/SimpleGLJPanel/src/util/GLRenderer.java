package util;

import bean.Linha;
import bean.Objeto;
import bean.Ponto;
import java.awt.Color;
import java.util.List;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;


/**
 * GLRenderer.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class GLRenderer implements GLEventListener {

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
      
        //recuperar o objeto correto!!!!!!!!!!!
        Objeto objetoDesenhado = new Objeto();
       
        //OBJETO USADO PARA TESTE!!!!!OBJETO USADO PARA TESTE!!!!!OBJETO USADO PARA TESTE!!!!!OBJETO USADO PARA TESTE!!!!!OBJETO USADO PARA TESTE!!!!!OBJETO USADO PARA TESTE!!!!!
        Ponto ponto1teste = new Ponto();
        ponto1teste.coordenada_x = 0;
        ponto1teste.coordenada_y = 0;
        ponto1teste.coordenada_z = 0;
        
        Ponto ponto2teste = new Ponto();
        ponto2teste.coordenada_x = 1.3;
        ponto2teste.coordenada_y = 1.5;
        ponto2teste.coordenada_z = 0;
        
        Linha linhateste = new Linha();
        linhateste.ponto1 = ponto1teste;
        linhateste.ponto2 = ponto2teste;
        linhateste.cor = Color.blue;
        
        objetoDesenhado.addLinha(linhateste);
        
        Ponto ponto3teste = new Ponto();
        ponto3teste.coordenada_x = 0;
        ponto3teste.coordenada_y = 0;
        ponto3teste.coordenada_z = 0;
        
        Ponto ponto4teste = new Ponto();
        ponto4teste.coordenada_x = -0.3;
        ponto4teste.coordenada_y = -1.5;
        ponto4teste.coordenada_z = 0;
        
        Linha linha2teste = new Linha();
        linha2teste.ponto1 = ponto3teste;
        linha2teste.ponto2 = ponto4teste;
        linha2teste.cor = Color.yellow;
        
        objetoDesenhado.addLinha(linha2teste);          
       
        Ponto ponto5teste = new Ponto();
        ponto5teste.coordenada_x = 0;
        ponto5teste.coordenada_y = 0;
        ponto5teste.coordenada_z = 0;
        
        Ponto ponto6teste = new Ponto();
        ponto6teste.coordenada_x = 1.3;
        ponto6teste.coordenada_y = -1.5;
        ponto6teste.coordenada_z = 2;
        
        Linha linha3teste = new Linha();
        linha3teste.ponto1 = ponto5teste;
        linha3teste.ponto2 = ponto6teste;
        linha3teste.cor = Color.blue;
        
        objetoDesenhado.addLinha(linha3teste);  
        
        //OBJETO USADO PARA TESTE!!!!!//OBJETO USADO PARA TESTE!!!!!//OBJETO USADO PARA TESTE!!!!!//OBJETO USADO PARA TESTE!!!!!
        
        GL gl = drawable.getGL();
        
        // Move the "drawing cursor" around
        gl.glTranslatef(0.0f, 0.0f, -6.0f);

        
        //for para desenhar todas as lihas do objeto
        for(int i = 0 ; i < objetoDesenhado.linhas.size() ; i++ )
        {
            Ponto ponto1 = objetoDesenhado.linhas.get(i).getPonto1();
            Ponto ponto2 = objetoDesenhado.linhas.get(i).getPonto2();
            Color corLinha = objetoDesenhado.linhas.get(i).getCor();
            
            gl.glBegin(GL.GL_LINES);
                gl.glColor3f(corLinha.getRed(),corLinha.getGreen(),corLinha.getBlue());    // seta a cor
                gl.glVertex3d(ponto1.coordenada_x,ponto1.coordenada_y,ponto1.coordenada_z);   // coordenadas           
                gl.glVertex3d(ponto2.coordenada_x,ponto2.coordenada_y,ponto2.coordenada_z); // coordenadas    
           
            gl.glEnd();
         
         
        }
      // Flush all drawing operations to the graphics card
      gl.glFlush();     
      
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

