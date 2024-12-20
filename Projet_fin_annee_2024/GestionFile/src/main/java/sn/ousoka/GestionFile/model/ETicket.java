package sn.ousoka.GestionFile.model;

public class ETicket {
    private int id;
    private int position;
    private QueueStatus status;
    private Localisation localisation;

    // Constructeur
    public ETicket(int id, int position, QueueStatus status, Localisation localisation) {
        this.id = id;
        this.position = position;
        this.status = status;
        this.localisation = localisation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public QueueStatus getStatus() {
        return status;
    }

    public void setStatus(QueueStatus status) {
        this.status = status;
    }

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }

    @Override
    public String toString() {
        return "ETicket{" +
                "id=" + id +
                ", position=" + position +
                ", status='" + status + '\'' +
                ", localisation=" + localisation +
                '}';
    }
}
