
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Goods {

	  private String hidden_goods;
	  private String hidden_goodsIntermediate;
	  private String hidden_goodsHardest;
	  private String hidden_hint;
	  private String hidden_hintIntermediate;
	  private String hidden_hintHardest;
	
	    List<String> easyGoods;
	    List<String> intermediateGoods;
	    List<String> hardestGoods;
	    
		Random generator= new Random();
		
		//constructor produces 3 levels array list such as easyGoods, intermediateGoods and hardestGoods
	    public Goods() {
		 easyGoods=new ArrayList();
		 intermediateGoods=new ArrayList();
		 hardestGoods=new ArrayList();
		 
		}
		// sets goods' names
	    public void setEasygoods() {
	    	easyGoods.add("bed");
	    	easyGoods.add("carpet");
	    	easyGoods.add("closet");
	    	easyGoods.add("freezer");
	    	easyGoods.add("glass");
	    	easyGoods.add("kettle");
	    	easyGoods.add("couch");
	    	easyGoods.add("lamp");
	    	easyGoods.add("mirror");
	    	easyGoods.add("vase");
	    	easyGoods.add("wardrobe");
	    	easyGoods.add("bathtub");
	    	easyGoods.add("blanket");
	    	easyGoods.add("plant");
	    	easyGoods.add("painting");
	    	easyGoods.add("fireplace");
	    	easyGoods.add("cushion");
	    	easyGoods.add("curtain");
	    	
	    }
	
	    //randomly select a good related word from the easy category
	    public String selectEasyGoods() {
	    	setEasygoods();
	    	int index=generator.nextInt(easyGoods.size());
	    	hidden_goods= easyGoods.get(index);
	    	return hidden_goods;
	    	
	    }
	    

	    public void setIntermediategoods() {
	    	
	    	intermediateGoods.add("shelf");
	    	intermediateGoods.add("rug");
	    	intermediateGoods.add("hairbrush");
	    	intermediateGoods.add("soap");
	    	intermediateGoods.add("towel");
	    	intermediateGoods.add("bookshelf");
	    	intermediateGoods.add("armchair");
	    	intermediateGoods.add("sofa");
	    	intermediateGoods.add("bench");
	    	intermediateGoods.add("cradle");
	    	intermediateGoods.add("clock");
	    	intermediateGoods.add("desk");
	    	intermediateGoods.add("nightstand");
	    	intermediateGoods.add("bunk bed");
	    	intermediateGoods.add("spoon");
	    	intermediateGoods.add("door");
	    	intermediateGoods.add("comb");
	    	intermediateGoods.add("hang");
	    	intermediateGoods.add("flower Pot");
	    	intermediateGoods.add("chandelier");
	    		
	    }
		
	  
	   //randomly select a good related word from the intermediate category
	    public String selectIntermediateGoods() {
	    	setIntermediategoods();
	    	int index=generator.nextInt(intermediateGoods.size());
	    	hidden_goodsIntermediate=intermediateGoods.get(index);
	    	return hidden_goodsIntermediate;
	    	
	    }
	    
	    
	    public void setHardestgoods() {
	    	
		    hardestGoods.add("ashtray");
		    hardestGoods.add("basin");
		    hardestGoods.add("cauldron");
		    hardestGoods.add("decanter");
		    hardestGoods.add("oven");
		    hardestGoods.add("screwdriver");
		    hardestGoods.add("showcase");
		    hardestGoods.add("stove");
		    hardestGoods.add("vacuum cleaner");
		    hardestGoods.add("Crib");
		    hardestGoods.add("iron");
		    hardestGoods.add("drinks cabinet");
		    hardestGoods.add("blinds");
		    hardestGoods.add("tablecloth");
		    hardestGoods.add("Toaster");
		    hardestGoods.add("Drawer");
		    hardestGoods.add("Apron");
		    hardestGoods.add("Pillowcase");
		    hardestGoods.add("Printer");
		    hardestGoods.add("bin");
	    }
		
	    //randomly select a good related word from the hardest category
	    public String selectHardestGoods() {
	    	setHardestgoods();
	    	int index=generator.nextInt(hardestGoods.size());
	    	hidden_goodsHardest= hardestGoods.get(index);
	    	return hidden_goodsHardest;
	    	
	    }
	    
	    //matches hints with goods
	    public void setEasygoodsHint() {
	    	if(hidden_goods.equalsIgnoreCase("bed"))
	    		hidden_hint="a piece of furniture for sleep or rest";
	    	else if(hidden_goods.equalsIgnoreCase("carpet"))
	    		hidden_hint="a floor covering made from thick woven fabric";
	    	else if(hidden_goods.equalsIgnoreCase("closet"))
	    		hidden_hint="used for storage";
	    	else if(hidden_goods.equalsIgnoreCase("freezer"))
	    		hidden_hint=" preserving food at very low temperatures";
	    	else if(hidden_goods.equalsIgnoreCase("glass"))
	    		hidden_hint="used to consume beverage";
	    	else if(hidden_goods.equalsIgnoreCase("kettle"))
	    		hidden_hint="device in which water is boiled";
	    	else if(hidden_goods.equalsIgnoreCase("couch"))
	    		hidden_hint="several people can sit on";
	    	else if(hidden_goods.equalsIgnoreCase("lamp"))
	    		hidden_hint="a device for giving light";
	    	else if(hidden_goods.equalsIgnoreCase("mirror"))
	    		hidden_hint="show a reflection.";
	    	else if(hidden_goods.equalsIgnoreCase("vase"))
	    		hidden_hint="a decorative container without handles";
	    	else if(hidden_goods.equalsIgnoreCase("wardrobe"))
	    		hidden_hint="which clothes may be hung or stored";
	    	else if(hidden_goods.equalsIgnoreCase("bathtub"))
	    		hidden_hint="boat-shaped device used for washing";
	    	else if(hidden_goods.equalsIgnoreCase("blanket"))
	    		hidden_hint="used as a covering on a bed or elsewhere for warmth";
	    	else if(hidden_goods.equalsIgnoreCase("plant"))
	    		hidden_hint=" used for decoration in homes";
	    	else if(hidden_goods.equalsIgnoreCase("painting"))
	    		hidden_hint="a piece of art used for home decoration";
	    	else if(hidden_goods.equalsIgnoreCase("fireplace"))
	    		hidden_hint="a place for a domestic fire, especially a grate or hearth at the base of a chimney";
	    	else if(hidden_goods.equalsIgnoreCase("cushion"))
	    		hidden_hint="used as a comfortable support for sitting or leaning on.";
	    	else if(hidden_goods.equalsIgnoreCase("curtain"))
	    		hidden_hint="a piece of material suspended at the top to form a screen";
	    	
	    }
	     
	    // gets correct hint
	    public String getEasygoodsHint() {
	    	setEasygoodsHint();
	    	return hidden_hint;
	    }
	    
	    public void setIntermediategoodsHint() {
	    	if(hidden_goodsIntermediate.equalsIgnoreCase("shelf"))
	    		hidden_hintIntermediate="a flat length of wood or other rigid material";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("rug"))
	    		hidden_hintIntermediate="a floor covering of thick woven material or animal skin";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("hairbrush"))
	    		hidden_hintIntermediate="a brush for smoothing a person's hair";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("soap"))
	    		hidden_hintIntermediate="It is a solid cleaning agent";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("towel"))
	    		hidden_hintIntermediate="a piece of thick absorbent cloth or paper";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("chandelier"))
	    		hidden_hintIntermediate="decorative hanging light with branches for several light bulbs or candles";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("bookshelf"))
	    		hidden_hintIntermediate="a shelf on which books can be stored";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("armchair"))
	    		hidden_hintIntermediate="large item designed for many people to sit comfortably";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("sofa"))
	    		hidden_hintIntermediate="a long upholstered seat with a back and arms";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("bench"))
	    		hidden_hintIntermediate="a long seat for several people, typically made of wood or stone";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("cradle"))
	    		hidden_hintIntermediate="a baby's bed or cot, typically one mounted on rockers";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("clock"))
	    		hidden_hintIntermediate="a device used to measure and indicate time";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("desk"))
	    		hidden_hintIntermediate=" piece of furniture with a flat or sloping surface and typically with drawers";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("nightstand"))
	    		hidden_hintIntermediate="a small low bedside table, typically having drawers";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("bunk bed"))
	    		hidden_hintIntermediate="a piece of furniture consisting of two beds, one above the other, that form a unit";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("spoon"))
	    		hidden_hintIntermediate="an implement consisting of a small, shallow oval or round bowl on a long handle, used for eating";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("door"))
	    		hidden_hintIntermediate="a hinged, sliding, or revolving barrier at the entrance to a building";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("comb"))
	    		hidden_hintIntermediate="a strip of plastic, metal, or wood with a row of narrow teeth, used for untangling or arranging the hair.";

	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("hang"))
	    		hidden_hintIntermediate="item used to hang things";
	    	else if(hidden_goodsIntermediate.equalsIgnoreCase("flower Pot"))
	    		hidden_hintIntermediate="a small container, typically with sloping sides and made from plastic or earthenware, used for growing a plant in.";

	    }
	     
	    
	    public String getIntermediategoodsHint() {
	    	setIntermediategoodsHint();
	    	return hidden_hintIntermediate;
	    }
	    
	    public void setHardestgoodsHint() {
	    	
	    		if(hidden_goodsHardest.equalsIgnoreCase("ashtray"))
		    		hidden_hintHardest="a small receptacle for tobacco ash and cigarette ends.";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("basin"))
		    		hidden_hintHardest="a bowl for washing";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("cauldron"))
		    		hidden_hintHardest="a large metal pot with a lid and handle, used for cooking over an open fire";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("decanter"))
		    		hidden_hintHardest="a stoppered glass container into which wine or spirit";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("oven"))
		    		hidden_hintHardest="used to describe a very hot place";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("screwdriver"))
		    		hidden_hintHardest="a tool with a flattened or cross-shaped tip";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("showcase"))
		    		hidden_hintHardest="a glass case used for displaying articles in a shop or museum";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("stove"))
		    		hidden_hintHardest="a hothouse for plants";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("vacuum cleaner"))
		    		hidden_hintHardest="an electrical apparatus that by means of suction collects dust and small particles from floors";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("Crib"))
		    		hidden_hintHardest="a child's bed with barred or latticed sides";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("iron"))
		    		hidden_hintHardest="It is a tool used for smoothing the wrinkles of fabrics and ironing";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("drinks cabinet"))
		    		hidden_hintHardest="used to store bottles of spirits such as wine and whiskey";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("blinds"))
		    		hidden_hintHardest="a screen for a window, especially one on a roller or made of slats";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("tablecloth"))
		    		hidden_hintHardest=" cloth spread over a table, especially during meals";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("Toaster"))
		    		hidden_hintHardest="an electrical device for making toast";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("Drawer"))
		    		hidden_hintHardest="a box-shaped storage compartment without a lid";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("Apron"))
		    		hidden_hintHardest="a protective garment worn over the front of one's clothes and tied at the back";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("Pillowcase"))
		    		hidden_hintHardest="a removable cloth cover for a pillow";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("Printer"))
		    		hidden_hintHardest="a machine for printing text or pictures";
		    	else if(hidden_goodsHardest.equalsIgnoreCase("bin"))
		    		hidden_hintHardest="a receptacle in which to deposit rubbish";

	    }
	     
	     public String getHardestgoodsHint() {
	    	setHardestgoodsHint();
	    	return hidden_hintHardest;
	    }
	   
	    

		
}
