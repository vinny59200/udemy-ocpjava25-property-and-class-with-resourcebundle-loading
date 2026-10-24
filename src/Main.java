//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        ResourceBundle bundle = ResourceBundle.getBundle( "Person" );
        String name = bundle.getString( "name" );
        System.out.println( name );
}
