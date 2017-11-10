/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobatubess;

/**
 *
 * @author Thirafi Wian
 */
public class safeForWork {
    private boolean sfw;
    private int idSfw;

    public safeForWork(boolean sfw, int idSfw) {
        this.sfw = sfw;
        this.idSfw = idSfw;
    }

    public boolean isSfw() {
        return sfw;
    }

    public void setSfw(boolean sfw) {
        this.sfw = sfw;
    }

    public int getIdSfw() {
        return idSfw;
    }

    public void setIdSfw(int idSfw) {
        this.idSfw = idSfw;
    }
    
    
}
