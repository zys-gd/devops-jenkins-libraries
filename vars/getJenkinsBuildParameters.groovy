LinkedHashMap call(build) {

  LinkedHashMap parameters = [:];

  def p = build?.actions.find { it instanceof ParametersAction }?.parameters
  p.each {
    parameters.put(it.name, it.value);
  }

  return parameters;
}