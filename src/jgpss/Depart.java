/**
 * Software end-user license agreement.
 *
 * The LICENSE.TXT containing the license is located in the JGPSS project.
 * License.txt can be downloaded here:
 * href="http://www-eio.upc.es/~Pau/index.php?q=node/28
 *
 * NOTICE TO THE USER: BY COPYING, INSTALLING OR USING THIS SOFTWARE OR PART OF
 * THIS SOFTWARE, YOU AGREE TO THE   TERMS AND CONDITIONS OF THE LICENSE AGREEMENT
 * AS IF IT WERE A WRITTEN AGREEMENT NEGOTIATED AND SIGNED BY YOU. THE LICENSE
 * AGREEMENT IS ENFORCEABLE AGAINST YOU AND ANY OTHER LEGAL PERSON ACTING ON YOUR
 * BEHALF.
 * IF, AFTER READING THE TERMS AND CONDITIONS HEREIN, YOU DO NOT AGREE TO THEM,
 * YOU MAY NOT INSTALL THIS SOFTWARE ON YOUR COMPUTER.
 * UPC IS THE OWNER OF ALL THE INTELLECTUAL PROPERTY OF THE SOFTWARE AND ONLY
 * AUTHORIZES YOU TO USE THE SOFTWARE IN ACCORDANCE WITH THE TERMS SET OUT IN
 * THE LICENSE AGREEMENT.
 */

package jgpss;

/**
 * A class representing the DEPART block.
 * @author Pau Fonseca i Casas
 * @version 1
 * @see     <a href="http://www-eio.upc.es/~Pau/index.php?q=node/28">Project website</a>
 * @serialData
 */
public class Depart extends Bloc{
    
    private String A;
    private int B;
    /** Creates a new instance of Depart
     * @param comentari the comment of the block.
     * @param label the label of the block.
     * @param A the name of the QUEUE.
     * @param B the number of elements leaving the QUEUE.
     */
     public Depart(String comentari, String label, String A, int B) {
        
       this.setId(Constants.idDepart);
       this.setLabel(label);
       this.setComentari(comentari);
        this.A = A;
        this.B = B;
    }

     /**
      * To obtain the QUEUE.
      * @return the name of the QUEUE.
      */
     public String getA() {
        return A;
    }

    /**
     * To set the name of the QUEUE.
     * @param A the name of the QUEUE.
     */
    public void setA(String A) {
        this.A = A;
    }

    /**
     * To obtain the number of elements that leave the QUEUE.
     * @return the number of elements that leave the QUEUE.
     */
    public int getB() {
        return B;
    }

    /**
     * To set the number of elements that leave the QUEUE.
     * @param B the number of elements that leave the QUEUE.
     */
    public void setB(int B) {
        this.B = B;
    }
    
    /**
     * To execute the block
     * @param tr the current XACT (that cross the block).
     * @return return NULL if no more blocs can be executed now. The next block
     * otherwise.
     */
    public Bloc execute(Xact tr) {
        //TODO.
        return null;
    }    
}
