import Vue from 'vue';
import Router from 'vue-router';


Vue.use(Router);


export const router = new Router({
    mode: 'history',
    // eslint-disable-next-line no-unused-vars
    scrollBehavior(to,from,savedPosition){
        document.getElementById('app').scrollIntoView();
    },

    routes: [

        {
            path:'',
            name:'home',
            component: () => import('@/components/Home'),
            meta:{
                title:'MySoftware'
            }
        },
        {
          path:'/company',
          name:'company',
          component:()=>import('@/components/Company'),
          children:[
              {
                  path:'/company/about',
                  component:()=> import('@/components/company-views/About'),
                  meta:{
                      title:'About - MySoftware'
                  }
              },
              {
                  path:'/company/partnerships',
                  component:()=> import('@/components/company-views/Partnerships'),
                  meta:{
                      title:'Partnerships - MySoftware'
                  }
              },
              {
                  path:'/company/careers',
                  component:()=> import('@/components/company-views/Careers'),
                  meta:{
                      title:'Careers - MySoftware'
                  }
              },
              {
                  path:'/company/awards',
                  component:()=> import('@/components/company-views/Awards'),
                  meta:{
                      title:'Awards - MySoftware'
                  }
              }
          ]
        },
        {
            path:'/company/contact',
            name:'contact',
            component: ()=> import('@/components/Contact'),
            meta:{
                title:'Contact - MySoftware'
            }

        },
        {
            path:'/software',
            name:'software',
            component: ()=> import('@/components/Software'),
            meta:{
                title: 'Software - MySoftware'
            },
            children:[
                {
                    path: '/software/customSoftwareDevelopment',
                    component: () => import('@/components/software-views/CustomSoftwareDevelopment')
                },
                {
                    path: '/software/websiteDesignAndDevelopment',
                    component: () => import('@/components/software-views/WebsiteDesignAndDevelopment')
                },
                {
                    path: '/software/mobileApplicationDevelopment',
                    component: () => import('@/components/software-views/MobileApplicationDevelopment')
                }
            ]

        },
        {
            path:'/martech',
            name:'martech',
            component: ()=> import('@/components/Martech'),
            meta:{
              title: 'Martech - MySoftware'
            },
            children:[
                {
                    path: '/martech/seo-semManagement',
                    component: () => import('@/components/martech-views/SeoSemManagement')
                },
                {
                    path: '/martech/omni-channelMarketing',
                    component: () => import('@/components/martech-views/OmniChannelMarketing')
                },
                {
                    path: '/martech/marketingAutomationSystems',
                    component: () => import('@/components/martech-views/MarketingAutomationSystems')
                },
                {
                    path: '/martech/contentManagementSystem',
                    component: () => import('@/components/martech-views/ContentManagementSystem')
                }
            ]

        },
        {
            path:'/social',
            name:'social',
            component: ()=> import('@/components/Social'),
            meta:{
              title: 'Social  - MySoftware'
            },
            children:[
                {
                    path: '/social/socialMediaManagement',
                    component: () => import('@/components/social-views/SocialMediaManagement')

                },
                {
                    path: '/social/socialMediaMarketing',
                    component: () => import('@/components/social-views/SocialMediaMarketing')
                },
                {
                    path: '/social/socialMediaGovernanceAndSecurity',
                    component: () => import('@/components/social-views/SocialMediaGovernanceAndSecurity')
                }
            ]

        },
        {
            path:'/insights',
            name:'insights',
            component: ()=> import('@/components/Insights'),
            meta:{
                title: 'Insights - MySoftware'
            },
            children:[
                {
                    path:'/insights/onlineLandscapeAnalysis',
                    component:() => import('@/components/insights-views/OnlineLandscapeAnalysis')
                },
                {
                    path: '/insights/activeListening',
                    component:() => import('@/components/insights-views/ActiveListening')
                },
                {
                    path: '/insights/SocialDataInsights',
                    component: () => import('@/components/insights-views/SocialDataInsights')
                }
            ]

        },

    ]
});