package nl.rekijan.notepad.models;

/**
 * //TODO write description of this class
 *
 * @author Erik-Jan Krielen ej.krielen@gmail.com
 * @since 10-7-2016
 */
public class Note {
    private Long id;
    private String title;
    private String content;
    private Long dateCreated;
    private Long dataModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Long dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Long getDataModified() {
        return dataModified;
    }

    public void setDataModified(Long dataModified) {
        this.dataModified = dataModified;
    }
}
