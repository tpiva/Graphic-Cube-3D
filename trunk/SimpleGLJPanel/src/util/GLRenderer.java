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
        
        
        //Desenha as coordenadas de referencia
         gl.glBegin(GL.GL_LINES);
                gl.glColor3f(10,10,10);    // seta a cor
                gl.glVertex3d(0,0,0);   // coordenadas           
                gl.glVertex3d(150,0,0); // coordenadas               
         gl.glEnd();
            
        gl.glBegin(GL.GL_LINES);
                gl.glColor3f(10,10,10);    // seta a cor
                gl.glVertex3d(0,0,0);   // coordenadas           
                gl.glVertex3d(0,150,0); // coordenadas               
         gl.glEnd();
         
         gl.glBegin(GL.GL_LINES);
                gl.glColor3f(10,10,10);    // seta a cor
                gl.glVertex3d(0,0,0);   // coordenadas           
                gl.glVertex3d(-150,-150,0); // coordenadas               
         gl.glEnd();
           
         Objeto objetoDesenhado = new Objeto();
       
        //OBJETO USADO PARA TESTE!!!!!OBJETO USADO PARA TESTE!!!!!OBJETO USADO PARA TESTE!!!!!OBJETO USADO PARA TESTE!!!!!OBJETO USADO PARA TESTE!!!!!OBJETO USADO PARA TESTE!!!!!
        Ponto pontoAteste = new Ponto();
        pontoAteste.coordenada_x = -1;
        pontoAteste.coordenada_y = 1;
        pontoAteste.coordenada_z = -1;
        
        Ponto pontoBteste = new Ponto();
        pontoBteste.coordenada_x = 1;
        pontoBteste.coordenada_y = 1;
        pontoBteste.coordenada_z = -1;       
       
        
        Ponto pontoCteste = new Ponto();
        pontoCteste.coordenada_x = 1;
        pontoCteste.coordenada_y = -1;
        pontoCteste.coordenada_z = -1;
        
        Ponto pontoDteste = new Ponto();
        pontoDteste.coordenada_x = -1;
        pontoDteste.coordenada_y = -1;
        pontoDteste.coordenada_z = -1;
        
       
        Ponto pontoEteste = new Ponto();
        pontoEteste.coordenada_x = -1;
        pontoEteste.coordenada_y = 1;
        pontoEteste.coordenada_z = 1;
        
        Ponto pontoFteste = new Ponto();
        pontoFteste.coordenada_x = 1;
        pontoFteste.coordenada_y = 1;
        pontoFteste.coordenada_z = 1;
        
        
        Ponto pontoGteste = new Ponto();
        pontoGteste.coordenada_x = 1;
        pontoGteste.coordenada_y = -1;
        pontoGteste.coordenada_z = 1;
        
        Ponto pontoHteste = new Ponto();
        pontoHteste.coordenada_x = -1;
        pontoHteste.coordenada_y = -1;
        pontoHteste.coordenada_z = 1;
        
        Linha linha3teste = new Linha();
        linha3teste.ponto1 = pontoAteste;
        linha3teste.ponto2 = pontoBteste;
        linha3teste.cor = Color.blue;
        
       objetoDesenhado.addLinha(linha3teste);
       
        Linha linha4teste = new Linha();
       linha4teste.ponto1 = pontoBteste;
        linha4teste.ponto2 = pontoCteste;
        linha4teste.cor = Color.RED;
        
       objetoDesenhado.addLinha(linha4teste);
        
       Linha linha5teste = new Linha();
       
       linha5teste.ponto1 = pontoCteste;
        linha5teste.ponto2 = pontoDteste;
        linha5teste.cor = Color.WHITE;
        
       objetoDesenhado.addLinha(linha5teste);
        
       Linha linha6teste = new Linha();
       
       linha6teste.ponto1 = pontoDteste;
        linha6teste.ponto2 = pontoAteste;
        linha6teste.cor = Color.YELLOW;
        
       objetoDesenhado.addLinha(linha6teste);
        
       Linha linha7teste = new Linha();
       
       linha7teste.ponto1 = pontoEteste;
        linha7teste.ponto2 = pontoFteste;
        linha7teste.cor = Color.DARK_GRAY;
        
       objetoDesenhado.addLinha(linha7teste);
        
       Linha linha8teste = new Linha();
       
       linha8teste.ponto1 = pontoFteste;
        linha8teste.ponto2 = pontoGteste;
        linha8teste.cor = Color.blue;
        
       objetoDesenhado.addLinha(linha8teste);
        
       Linha linha1teste = new Linha();
       
         linha1teste.ponto1 = pontoGteste;
        linha1teste.ponto2 = pontoHteste;
        linha1teste.cor = Color.green;
        
       objetoDesenhado.addLinha(linha1teste);
       
       Linha linha2teste = new Linha();
       
          linha2teste.ponto1 = pontoHteste;
        linha2teste.ponto2 = pontoEteste;
        linha2teste.cor = Color.RED;
        
       objetoDesenhado.addLinha(linha2teste);
       
       Linha linha9teste = new Linha();
          linha9teste.ponto1 = pontoAteste;
        linha9teste.ponto2 = pontoEteste;
        linha9teste.cor = Color.BLUE;
        
       objetoDesenhado.addLinha(linha9teste);
       
       
       Linha linha10teste = new Linha();
          linha10teste.ponto1 = pontoBteste;
        linha10teste.ponto2 = pontoFteste;
        linha10teste.cor = Color.BLUE;
        
       objetoDesenhado.addLinha(linha10teste);
       
       
         Linha linha11teste = new Linha();
       
          linha11teste.ponto1 = pontoCteste;
        linha11teste.ponto2 = pontoGteste;
        linha11teste.cor = Color.BLUE;
        
       objetoDesenhado.addLinha(linha11teste);
       
       
       Linha linha12teste = new Linha();
          linha12teste.ponto1 = pontoDteste;
        linha12teste.ponto2 = pontoHteste;
        linha12teste.cor = Color.BLUE;
        
       objetoDesenhado.addLinha(linha12teste);
        
      
        
        //OBJETO USADO PARA TESTE!!!!!//OBJETO USADO PARA TESTE!!!!!//OBJETO USADO PARA TESTE!!!!!//OBJETO USADO PARA TESTE!!!!!
         
        gl.glViewport(0, 0, width, height);        
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
        
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
                gl.glVertex4d(ponto1.coordenada_x,ponto1.coordenada_y,ponto1.coordenada_z,1); // coordenadas    
                gl.glVertex4d(ponto2.coordenada_x,ponto2.coordenada_y,ponto2.coordenada_z,1); // coordenadas   
            gl.glEnd();
         
         
        }
      // Flush all drawing operations to the graphics card
      gl.glFlush();
        
    }

    public void display(GLAutoDrawable drawable) {
      
    
       
      
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

