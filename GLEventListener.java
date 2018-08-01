
import static com.jogamp.opengl.GL.GL_COLOR_BUFFER_BIT;
import static com.jogamp.opengl.GL.GL_DEPTH_BUFFER_BIT;
import static com.jogamp.opengl.GL.GL_LINES;
import static com.jogamp.opengl.GL.GL_LINE_LOOP;
import static com.jogamp.opengl.GL.GL_TRIANGLES;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.glu.GLU;


public class GLEventListener implements com.jogamp.opengl.GLEventListener {
    
    // Initial xalues of x,y to for resetting
    static final double initialX = 387;
    static final double initialY = 207;
    static final double initialZ = 100;
    
    // Current shape coordinates
    public static double x1 = 387.5;
    public static double y1 = 207.5;
    public static double z1 = 100;
    
    // Next shape coordinates (after transformation)
    public static double x2 = x1;
    public static double y2 = y1;
    public static double z2 = z1;
    
    // Shape dimentions
    public static double rectHeight = 50;
    public static double rectWidth = 50;
    public static double rectDepth = 50;
    
    //Scale factor
    public static double scaleFactor = 1;
    
    /**
     * Return initial x coordinate of object
     * @return 
     */
    public double getInitX()
    {
        return initialX;
    }
    
    /**
     * Return initial y coordinate of object
     * @return 
     */
    public double getInitY()
    {
        return initialY;
    }
    
    /**
     * Return x coordinate of object
     * @return 
     */
    public double getX1()
    {
        return x1;
    }
    
    /**
     * Return y coordinate of object
     * @return x1
     */
    public double getY1()
    {
        return y1;
    }
    
    /**
     * Setter for x1
     * @param val 
     */
    public void setX1(double val)
    {
        x1 = val;
    }
    
    /**
     * Setter for y1
     * @param val 
     */
    public void setY1(double val)
    {
        y1 = val;
    }
    
        /**
     * Return x coordinate of object
     * @return 
     */
    public double getX2()
    {
        return x2;
    }
    
    /**
     * Return y coordinate of object
     * @return x1
     */
    public double getY2()
    {
        return y2;
    }
    
    /**
     * Setter for x1
     * @param val 
     */
    public void setX2(double val)
    {
        x2 = val;
    }
    
    /**
     * Setter for y1
     * @param val 
     */
    public void setY2(double val)
    {
        y2 = val;
    }
    
    /**
     * Translation in x axis by value of tx
     * @param tx
     */
    public void translateX(double tx) {
        x2 = x1 + tx;
    }
    
    /**
     * Translation in y axis by value of ty
     * @param ty
     */ 
    public void translateY(double ty) {
        y2 = y1 + ty;
    }
    
    /**
     * Translation in z axis by value of tz
     * @param tz
     */ 
    public void translateZ(double tz) {
        z2 = tz; 
    }
    
    /**
     * Rotation transformation 
     * @param theta the angle of rotation
     */
    public void rotate(double theta) 
    {
        
        x2 = (((x1 - 387.5) * Math.cos(Math.toRadians(theta))) - ((y1 - 207.5) * Math.sin(Math.toRadians(theta)))) ;
        y2 = (((x1 - 387.5) * Math.sin(Math.toRadians(theta))) + ((y1 - 207.5) * Math.cos(Math.toRadians(theta))));
        
        x2 += 387.5;
        y2 += 207.5;
        
        System.out.println("Translated! Theta:> " + theta + " X2:> " + x2 + " Y2:> " + y2);
    }
    
    /**
     * Scale transformation
     * @param scaleFactor 
     */
    public void scale(double val) 
    {
        scaleFactor = val; 
    }
    
    protected void setup(GL2 gl2, int width, int height) 
    {
        System.out.println("Setup");
        gl2.glMatrixMode(GL2.GL_PROJECTION);
        gl2.glLoadIdentity();

        // coordinate system origin at lower left with width and height same as the window
        GLU glu = new GLU();
        glu.gluOrtho2D(0.0f, width, 0.0f, height);

        gl2.glMatrixMode(GL2.GL_MODELVIEW);
        gl2.glLoadIdentity();

        gl2.glViewport(0, 0, width, height);
        
        gl2.glBegin(gl2.GL_LINE);
    }

    protected void render(GL2 gl2, int width, int height) 
    {
        System.out.println("Render");
        
        //draw lines to form axis
        //y axis
        gl2.glLineWidth(1); 
        gl2.glColor3d(1, 1, 1);
        gl2.glBegin(GL_LINES);
        gl2.glVertex3d(387.5, 415, 0.0);
        gl2.glVertex3d(387.5, 5, 0);
        gl2.glEnd();
              
        gl2.glBegin(GL_TRIANGLES);
        gl2.glVertex3d(387.5, 415, 0);
        gl2.glVertex3d(385, 410, 0);
        gl2.glVertex3d(390, 410, 0);
        gl2.glEnd();
        
        gl2.glBegin(GL_TRIANGLES);
        gl2.glVertex3d(385, 10, 0);
        gl2.glVertex3d(387.5, 5, 0);
        gl2.glVertex3d(390, 10, 0);
        gl2.glEnd();
        
        //x axis
        gl2.glBegin(GL_LINES);
        gl2.glVertex3d(10, 207.5, 0.0);
        gl2.glVertex3d(755, 207.5, 0);
        gl2.glEnd();
        
        gl2.glBegin(GL_TRIANGLES);
        gl2.glVertex3d(755, 207.5, 0);
        gl2.glVertex3d(750, 210, 0);
        gl2.glVertex3d(750, 205, 0);
        gl2.glEnd();
        
        gl2.glBegin(GL_TRIANGLES);
        gl2.glVertex3d(10, 207.5, 0);
        gl2.glVertex3d(15, 210, 0);
        gl2.glVertex3d(15, 205, 0);
        gl2.glEnd();

        //Draw the gl object with supplied parameter
    	gl2.glBegin(gl2.GL_QUADS);
        
        gl2.glColor3f(1, 0, 0); //set colour to red
        
        //draw vertexes to form a rectangle
        gl2.glVertex2d(x1, y1); 
        gl2.glVertex2d(x1 + (rectWidth * scaleFactor), y1);
        gl2.glVertex2d(x1 + (rectWidth * scaleFactor), y1 + (rectHeight * scaleFactor));
        gl2.glVertex2d(x1, y1 + (rectHeight * scaleFactor));
        gl2.glEnd();
    }
  
    @Override
    public void reshape(GLAutoDrawable glautodrawable, int x, int y, int width, int height) 
    {
        System.out.println("Reshape");
        setup(glautodrawable.getGL().getGL2(), width, height);
    }

    @Override
    public void init(GLAutoDrawable glautodrawable)
    {
    }

    @Override
    public void dispose(GLAutoDrawable glautodrawable) 
    {
    }

    @Override
    public void display(GLAutoDrawable glautodrawable) {
        System.out.println("Display");
        glautodrawable.getGL().getGL2().glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        render(glautodrawable.getGL().getGL2(), glautodrawable.getSurfaceWidth(), glautodrawable.getSurfaceHeight());
        
    }
}
