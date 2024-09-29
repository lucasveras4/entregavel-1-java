class primo {
    static boolean numeroPrimo(int n)
    {
        
        if (n <= 1)
            return false;

        
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    
    public static void main(String args[])
    {
        if (numeroPrimo(11))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (numeroPrimo(15))
            System.out.println(" true");
        else
            System.out.println(" false");
    }
}

