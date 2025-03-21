class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Set<String> sup = new HashSet<>();
        for (String s : supplies) {
            sup.add(s);
        }
        ArrayList<String> ans = new ArrayList<>();
        int n=recipes.length;
        boolean cooked[]=new boolean[n];
        while(n-->0){
            for (int j=0; j < recipes.length; j++) {
                if(cooked[j]){
                    continue;
                }
                boolean avail=true;
                for(int i=0;i<ingredients.get(j).size();i++){
                    if(!sup.contains(ingredients.get(j).get(i))){
                        avail=false;
                        break;}
                }
                if(avail){
                    cooked[j]=true;
                    ans.add(recipes[j]);
                    sup.add(recipes[j]);
                }

        }
        }
        return ans;
    } 
} 