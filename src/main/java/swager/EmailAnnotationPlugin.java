package swager;

    @Component
    @Order(Validators.BEAN_VALIDATOR_PLUGIN_ORDER)
    public class EmailAnnotationPlugin implements ModelPropertyBuilderPlugin {
        @Override
        public boolean supports(DocumentationType delimiter) {
            return true;
        }
        @Override
        public void apply(ModelPropertyContext context) {
            Optional<Email> email = annotationFromBean(context, Email.class);
            if (email.isPresent()) {
                context.getBuilder().pattern(email.get().regexp());
                context.getBuilder().example("email@email.com");
            }
        }
    }
}
