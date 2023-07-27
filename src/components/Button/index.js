import React, { Component } from 'react';
import { Text,View, TouchableOpacity, Alert } from 'react-native';
import PropTypes from 'prop-types';

// Stateless
const Button = () => {

  return (
    <TouchableOpacity
        onPress={ ()  =>  {
            Alert.alert(this.props.alerta);
        }}
    >
         {this.props.children}
    </TouchableOpacity>
  );
}

Button.propTypes = {
    alerta: PropTypes.string
}

Button.defaultProps = {
    alerta: "Valor padrao"
}

export default Button;

// Stateful
/*
export default class Button extends Component {

    static propTypes = {
        alerta: PropTypes.string,
    };

    static defaultProps = {
        alerta: 'valor padrão',
      };

    render() {
        return (
            <TouchableOpacity onPress={ ()  =>  {
                    Alert.alert(this.props.alerta);
                }}
            >
                <View>
                    {this.props.children}
                </View>
            </TouchableOpacity>
        )
    }
}
*/