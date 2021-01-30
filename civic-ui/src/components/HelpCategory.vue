<template>
  <div>
        <dropdownlist 
            :data-items='categories'
            :default-item="'What type of assistance do you need?'"
        >
        </dropdownlist>
    </div>
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