package _1lvShop.products;

public enum AgeRestriction {
    None,
    Teenager,
    Adult;

    public static boolean isMember(String s) {
        AgeRestriction[] values = AgeRestriction.values();
        for (AgeRestriction restriction : values)
            if (restriction.name().equals(s))
                return true;
        return false;
    }
}
