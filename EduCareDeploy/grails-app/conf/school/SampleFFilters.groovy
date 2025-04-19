package school

import com.hiideals.instituite.EDcoding.LookUpED;

class SampleFFilters {

	def filters = {
		match(action: ~/(show|edit)/) {
			before = {
				
				if(params.id){
					try{
						params.id = LookUpED.decod(params.id).toString()
					}catch(Exception e){
						redirect(controller:params.controller,action:'index')
						false
					}
				}
				else{
					//flash.message = "error"
					redirect(controller:params.controller,action:'index')
					false
				}
			}
			after = { Map model ->
			}
			afterView = { Exception e ->
			}
		}
	}
}
