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
public class notSafeForWork {
    private boolean nsfw ;
    private int idNsfw;

    public notSafeForWork(boolean nsfw, int idNsfw) {
        this.nsfw = nsfw;
        this.idNsfw = idNsfw;
    }

    public boolean isNsfw() {
        return nsfw;
    }

    public void setNsfw(boolean nsfw) {
        this.nsfw = nsfw;
    }

    public int getIdNsfw() {
        return idNsfw;
    }

    public void setIdNsfw(int idNsfw) {
        this.idNsfw = idNsfw;
    }
    
    
}
