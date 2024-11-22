public class Potato
{
    private String eyes;
    private String hair;
    private String feet;
    private String ears;
    private String nose;
    private String mouth;
    private boolean hasMustache;

    public Potato()
    {
        eyes = "Generic";
        hair = "Generic";
        feet= "Generic";
        ears= "Generic";
        nose= "Generic";
        mouth = "Generic";
        hasMustache = false;
    }

    public Potato(String eyes, String hair, String feet, String ears, String nose, String mouth, boolean hasMustache)
    {
        this.eyes = eyes;
        this.hair = hair;
        this.feet = feet;
        this.ears = ears;
        this.nose = nose;
        this.mouth = mouth;
        this.hasMustache = hasMustache;
    }

    public String getEyes()
    {
        return eyes;
    }

    public void setEyes(String eyes)
    {
        this.eyes = eyes;
    }

    public String getHair()
    {
        return hair;
    }

    public void setHair(String hair)
    {
        this.hair = hair;
    }

    public String getFeet()
    {
        return feet;
    }

    public void setFeet(String feet)
    {
        this.feet = feet;
    }

    public String getEars()
    {
        return ears;
    }

    public void setEars(String ears)
    {
        this.ears = ears;
    }

    public String getNose()
    {
        return nose;
    }

    public void setNose(String nose)
    {
        this.nose = nose;
    }

    public String getMouth()
    {
        return mouth;
    }

    public void setMouth(String mouth)
    {
        this.mouth = mouth;
    }

    public boolean isHasMustache()
    {
        return hasMustache;
    }

    public void setHasMustache(boolean hasMustache)
    {
        this.hasMustache = hasMustache;
    }

    public void sayGreeting()
    {
        System.out.println("I'm a-peeling, and you look spudtacular!");
    }

    public boolean isAPotato()
    {
        return true;
    }

    @Override
    public String toString()
    {
        return "Potato{" +
                "eyes='" + eyes + '\'' +
                ", hair='" + hair + '\'' +
                ", feet='" + feet + '\'' +
                ", ears='" + ears + '\'' +
                ", nose='" + nose + '\'' +
                ", mouth='" + mouth + '\'' +
                ", hasMustache=" + hasMustache +
                '}';
    }
}
