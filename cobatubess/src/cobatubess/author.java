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
public class author {
    private int idAuthor;
    private String namaAuthor;

    public author(int idAuthor, String namaAuthor) {
        this.idAuthor = idAuthor;
        this.namaAuthor = namaAuthor;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getNamaAuthor() {
        return namaAuthor;
    }

    public void setNamaAuthor(String namaAuthor) {
        this.namaAuthor = namaAuthor;
    }
    
    
}
