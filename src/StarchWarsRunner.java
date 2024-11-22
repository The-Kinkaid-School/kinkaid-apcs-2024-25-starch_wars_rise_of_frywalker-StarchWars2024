

public class StarchWarsRunner
{
    public void main()
    {
        Potato mrPH = new Potato();
        System.out.println(mrPH);
        Potato chip = new Potato("big","black","blue shoes","pink","red oval","toothy",true);
        System.out.println(chip);
        System.out.println(STR."Chip has \{chip.getFeet()} feet.");
        chip.sayGreeting();
        System.out.println("----------------------");
        Potato julliane = new Potato("lashed","white hat","red heels","pierced","orange","red lips",false);
        System.out.println(julliane);
        julliane.sayGreeting();
        System.out.println("----------------------");
        EvilPotato spudtrooper = new EvilPotato("beady","laser masher");
        System.out.println(spudtrooper);
        spudtrooper.sayGreeting();
        spudtrooper.useWeapon();
        System.out.println("-----------------------");
        Potato[] bushell = new Potato[4];
        bushell[0] = chip;
        bushell[1] = julliane;
        bushell[2] = mrPH;
        bushell[3] = spudtrooper;
        for (Potato p: bushell)
        {
            p.sayGreeting();
//            p.useWeapon();  // crashes on compile
        }
        System.out.println("=======================");
        SithPotato darthTater = new SithPotato("bloodshot");
        System.out.println(darthTater);
        darthTater.sayGreeting();
        darthTater.useWeapon();
        System.out.println(darthTater.isAPotato());
        System.out.println("************************");
        EvilPotato darthMash;
        darthMash = new SithPotato("inflamed");
        darthMash.useWeapon();
        System.out.println("++++++++++");
        EvilPotato[] badBatch = new EvilPotato[3];
        badBatch[0] = spudtrooper;
        badBatch[1] = darthMash;
        badBatch[2] = darthTater;

        for (EvilPotato ep : badBatch)
        {
            ep.useWeapon();
        }
        System.out.println("--------------");
        Potato anaskin;
        anaskin = new SithPotato("racer");
        ((SithPotato)anaskin).useWeapon();
        ((SithPotato)chip).useWeapon();
    }
}
