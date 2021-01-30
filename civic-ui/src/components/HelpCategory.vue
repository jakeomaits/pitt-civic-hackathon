<template>
  
       <span class="border"> <dropdownlist class="border"
            :data-items='categories'
            :default-item="'Please choose'"
        >
        </dropdownlist></span>
   
</template>
<script>
import { DropDownList } from '@progress/kendo-vue-dropdowns';

export default {
    name: "HelpCategory",
    components: {
        'dropdownlist': DropDownList
    },
    data: function () {
        return {
            categories: ['Home/ Repair', 
                    'Child/Dependent Care',
                    'Food/ Grocery',
                    'Transportation',
                    'Skill',
                    'Medical',
                    'Physical Good/ Donation'],
        };
    }
};

</script>
<style>
#fileInput {
  display: none;
}
h1,
h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
.my-8 {
  margin-top: 4rem;
  margin-bottom: 4rem;
}
</style>