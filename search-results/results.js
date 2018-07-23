var index = 0;
var number = 3;
var data_res = [{'uuid':'1', 'title':'First Result', 'text':'Suillus spraguei, the painted suillus, is a species of fungus in the family Suillaceae. Its readily identifiable fruit bodies have caps that are dark red when fresh, dry to the touch, and covered with mats of hairs and scales that are separated by yellow cracks. On the underside of the cap are small, yellow, angular pores that become brownish as the mushroom ages. The stalk bears a grayish cottony ring, and is typically covered with soft hairs or scales. S. spraguei grows in symbiosis with roots of several pine species, particularly the eastern white pine. The fruit body grows on the ground, appearing from early summer to autumn. It is found in eastern Asia, northeastern North America, and Mexico throughout the range of the host tree. The mushroom is edible, although opinions about its quality vary. It bears a resemblance to several other Suillus species, including the closely related S. decipiens, although the species can be differentiated by variations in color and size.'}, 
{'uuid':'2', 'title':'First Result', 'text':'Suillus spraguei, the painted suillus, is a species of fungus in the family Suillaceae. Its readily identifiable fruit bodies have caps that are dark red when fresh, dry to the touch, and covered with mats of hairs and scales that are separated by yellow cracks. On the underside of the cap are small, yellow, angular pores that become brownish as the mushroom ages. The stalk bears a grayish cottony ring, and is typically covered with soft hairs or scales. S. spraguei grows in symbiosis with roots of several pine species, particularly the eastern white pine. The fruit body grows on the ground, appearing from early summer to autumn. It is found in eastern Asia, northeastern North America, and Mexico throughout the range of the host tree. The mushroom is edible, although opinions about its quality vary. It bears a resemblance to several other Suillus species, including the closely related S. decipiens, although the species can be differentiated by variations in color and size.'}, 
{'uuid':'3', 'title':'First Result', 'text':'Suillus spraguei, the painted suillus, is a species of fungus in the family Suillaceae. Its readily identifiable fruit bodies have caps that are dark red when fresh, dry to the touch, and covered with mats of hairs and scales that are separated by yellow cracks. On the underside of the cap are small, yellow, angular pores that become brownish as the mushroom ages. The stalk bears a grayish cottony ring, and is typically covered with soft hairs or scales. S. spraguei grows in symbiosis with roots of several pine species, particularly the eastern white pine. The fruit body grows on the ground, appearing from early summer to autumn. It is found in eastern Asia, northeastern North America, and Mexico throughout the range of the host tree. The mushroom is edible, although opinions about its quality vary. It bears a resemblance to several other Suillus species, including the closely related S. decipiens, although the species can be differentiated by variations in color and size.'},
{'uuid':'test-4-res', 'title':'First Result', 'text':'oityeoiyteyotyieoyteoity'},
{'uuid':'test-5-res', 'title':'First Result', 'text':'oityeoiyteyotyieoyteoity'},
{'uuid':'test-6-res', 'title':'First Result', 'text':'oityeoiyteyotyieoyteoity'},
{'uuid':'test-7-res', 'title':'First Result', 'text':'oityeoiyteyotyieoyteoity'},
{'uuid':'test-8-res', 'title':'First Result', 'text':'oityeoiyteyotyieoyteoity'},
{'uuid':'test-9-res', 'title':'First Result', 'text':'oityeoiyteyotyieoyteoity'}];

$(document).ready(function(){
	show_results(data_res.slice(index, index+number));
	$('.more').on('click', function(){
		index++;
		show_results(data_res.slice(index, index+number));
	})
})

function get_details(uuid){
		console.log(uuid);
var modal = new Custombox.modal({
  content: {
    effect: 'fadein',
    target: '#modal',
	  fullscreen:true
  }
});

// Open
modal.open();	
}
	
function show_results(data){
	var panels = [];
	for(var i in data){
		panels.push(create_panel(data[i]));
	}
	panels.forEach(function(i){
		$('#results').append(i);
	})
	
}
function create_panel(result){
	console.log(result);
	var res_title = $('<h3>'+result.title+'</h3>');
	var res_text = $('<p>'+result.text+'</p>');
	var res_div = $('<div class="col-xs-6 col-sm-9 col-md-9 col-lg-10 title"></div>');
	var show_more = $('<div  class="text-right"><a onclick=get_details("'+result.uuid+'");>Show more</a></div>');
	var outer_div = $('<div></div>');
	res_div.append(res_title);
	res_div.append(res_text);
	outer_div.append(res_div);
	var row_div = $('<div class="row"></div>');
	row_div.append(outer_div);
	var panel = $('<div class="well search-result"></div>');
	panel.append(row_div);
	panel.append(show_more);
	return panel;
}