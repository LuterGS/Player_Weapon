class Weapon implements Property {

    private String name;
    private int ATK, DEF;
    private Property weapon_property = null;

    private void set_property(Object Property){

        if(Property instanceof Fire){
            this.weapon_property = (Fire) Property;
        }else if(Property instanceof Ice){
            this.weapon_property = (Ice) Property;
        }else if(Property instanceof Dark){
            this.weapon_property = (Dark) Property;
        }

    }
}
