/*
 * Activity 4.9.3
 */
public class Fish extends LakeObject
{
    @Override
    public int getCost()
    {
        return super.getWeight()*super.getCost();
    }

}