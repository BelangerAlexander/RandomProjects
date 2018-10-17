/**
 * @author Whoever wrote the the original class
 * @documentationAuthor Alexander Belanger
 * @since 2/5/2018
 */
public class Grasshopper extends Insect {

    private double jumpDistance;
    /**
     * The constructor.
     * 
     * Takes no arguments of any kind.
     */
    public Grasshopper() {
    }

    /**
     * This setter method sets the value of jumpDistance 
     * instance field.
     * 
     * @param dist The distance the Grasshopper can jump in Centimeters.
     */
    public void setJumpDist(double dist) {
        jumpDistance = dist;
    }
    
    /**
     * This getter method returns the value of jumpDistance
     * instance field.
     * 
     * @return the distance the Grasshopper can jump in Centimeters.
     */
    public double getJumpDist() {
        return jumpDistance;
    }
}