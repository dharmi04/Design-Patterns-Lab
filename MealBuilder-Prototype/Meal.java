class Meal implements Cloneable {
    private String mealname;
    private String restname;

    public Meal() {
        this.mealname = mealname;
        this.restname = restname;
    }

    public Meal(String mealname2, String restname2) {
        //TODO Auto-generated constructor stub
    }

    // Getters and setters
    public String getMealname() {
        return mealname;
    }

    public void setMealname(String mealname) {
        this.mealname = mealname;
    }

    public String getRestname() {
        return restname;
    }

    public void setRestname(String restname) {
        this.restname = restname;
    }

    @Override
    public String toString() {
        return "Meal is " + mealname + " and Restaurant name is: " + restname;
    }

    @Override
    public Meal clone() {
        try {
            return (Meal) super.clone();
        } catch (CloneNotSupportedException e) {
            // Handle clone not supported exception
            return null;
        }
    }
}
