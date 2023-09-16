package Other;


	public enum Direction {
	    EAST("E"),
	    WEST("W"),
	    NORTH("N"),
	    SOUTH("S");

	    private final String shortCode;

	    Direction(String string) {
			this.shortCode = "";
			// TODO Auto-generated constructor stub
		}

		public String getShortCode() {
	        return shortCode;
	    }
	
}
